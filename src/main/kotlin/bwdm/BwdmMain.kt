package bwdm

import bwdm.boundaryValueAnalysisUnit.BvaUnitMain
import bwdm.informationStore.InformationExtractor
import bwdm.symbolicExecutionUnit.SeUnitMain
import com.fujitsu.vdmj.lex.LexException
import com.fujitsu.vdmj.syntax.ParserException
import external.TimeMeasure

import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.util.ArrayList
import java.util.HashMap
import org.kohsuke.args4j.CmdLineException
import org.kohsuke.args4j.CmdLineParser


/**
 * main class of BWDM
 */
object BwdmMain {
    // build日
    private const val buildDate = "2018-1-24 PM19:03(JST)"

    /**
     * main method.
     *
     * @args args Command line arguments.
     */
    @Throws(LexException::class, ParserException::class, IOException::class)
    @JvmStatic
    fun main(vararg args: String) {
        execBWDM(*args)
    }

    /**
     * processing of BWDM
     *
     * @args args Command line arguments.
     */
    @Throws(IOException::class, LexException::class, ParserException::class)
    private fun execBWDM(vararg args: String) {
        val shell = Shell()

        val parser = CmdLineParser(shell)
        try {
            parser.parseArgument(*args)
        } catch (e: CmdLineException) {
            // 引数の型がおかしかったり、必須項目が足りないと例外
            System.err.println("Got Exception: " + e.message)
            parser.printUsage(System.err)
            System.exit(1)
        }

        //コマンド引数のパース
        when (args.size) {
            0->{
                printUsage(parser)
                return
            }
            1 //ヘルプ表示 or バージョン表示 or オプション指定ミス or ファイル指定による通常実行の4パターン
            -> {
                if (shell.versionFlag) {
                    printVersionInfo()
                }else if(shell.usageFlag){
                    printUsage(parser)
                }else{
                    printUsage(parser)
                }
                return
            }
        }

        /**オプションに従って出力文字列を生成 */
        var buf = ""
        val tm = TimeMeasure()
        tm.start()
        val extractInformation = InformationExtractor(shell.vdmFileName!!)
        val bvaUnitMain = BvaUnitMain(extractInformation, isPairwise = shell.showBvTestcasesWithPairwise)
        val seUnitMain = SeUnitMain(extractInformation)
        tm.finish()
        if (shell.showStandardInfo) {
            buf += "ファイルパス : " + File(shell.vdmFileName).canonicalPath + "\n"
            buf += "関数名 : " + extractInformation.functionName + "\n"
            buf += "引数の型 : "
            for (i in 0 until extractInformation.argumentTypes.size) {
                buf += (extractInformation.parameters[i] + ":"
                        + extractInformation.argumentTypes[i] + " ")
            }
            buf += "\n"
            buf += "戻り値の型 : " + extractInformation.returnValue + "\n"
            val bvTestcaseNum = bvaUnitMain.boundaryValueAnalyzer.inputDataList.size
            val seTestcaseNum = seUnitMain.se.inputDataList.size
            buf += "生成テストケース数 : " + (bvTestcaseNum + seTestcaseNum) + "件"
            buf += "(境界値分析:$bvTestcaseNum/記号実行:$seTestcaseNum)"
            buf += "\n\n"
        }
        if (shell.showBvsInfo) {
            buf += "各引数の境界値\n"
            val bvsList: HashMap<*, *> = bvaUnitMain.boundaryValueAnalyzer.boundaryValueList
            val parameters = extractInformation.parameters
            for (i in parameters.indices) {
                val currentPrm = parameters[i]
                val bvs: ArrayList<*> = bvsList[currentPrm] as ArrayList<*>
                buf += "$currentPrm : "
                for (bv in bvs) {
                    buf += bv.toString() + " "
                }
                buf += "\n"
            }
            buf += "\n"
        }
        if (shell.showSeConditionsInfo) {
            buf += "記号実行情報\n"
            val carvList = extractInformation.conditionAndReturnValueList
            buf += "戻り値の数 : " + carvList.size + "\n"

            for (i in 0 until carvList.size) {
                buf += "制約 : "
                val carv = carvList.conditionAndReturnValues[i]
                val conditions = carv.conditions
                val bools = carv.bools

                //はじめの一つ以外は、前に and をつけてくっつける
                buf += if (bools[0]) {
                    conditions[0] + " "
                } else {
                    "!( " + conditions[0] + " ) "
                }

                for (j in 1 until conditions.size) { //はじめの一個以外
                    buf += if (bools[j]) {
                        "and " + conditions[j]
                    } else {
                        "and !( " + conditions[j] + " ) "
                    }
                }
                buf += ", 戻り値 : " + carv.returnStr + "\n"
            }
            buf += "\n"
        }
        if (shell.showBvTestcases) {
            buf += "境界値分析によるテストケース\n"
            buf += bvaUnitMain.allTestcasesByBv
            buf += "\n"
        } else if (shell.showBvTestcasesWithPairwise) {
            buf += "境界値分析によるテストケース（ペアワイズ法適用）\n"
            buf += bvaUnitMain.allTestcasesByBv
            buf += "\n"
        }
        if (shell.showSeTestcases) {
            buf += "記号実行によるテストケース\n"
            buf += seUnitMain.allTestcasesBySe
            buf += "\n"
        }
        if (shell.displayOnConsole) {
            print(buf)
        }
        if (shell.printTimeMeasure){
            tm.printResult()
        }
        if (shell.writeFile) {
            outputFile(buf, extractInformation.vdmFilePath.replace("vdmpp", "tc"))
        }else if (shell.writeFileName != null){
            outputFile(buf, shell.writeFileName!!)
        }
    }

    private fun printUsage(parser: CmdLineParser) {
        println("Usage:")
        println(" bwdm [options] vdmFileName")
        println()
        println("Options:")
        parser.printUsage(System.out)
        return
    }

    private fun printVersionInfo() {
        println("BWDM (Boundary Values/VDM)")
        println("Automatic Testcase Generation Tool based on VDM++ Specification")
        println("Version : 2.0")
        println("Built date : $buildDate")
        println("Copyright (C) 2018, Hiroki TACHIYAMA and Futa HIRAKOBA(University of Miyazaki).")
        return
    }

    private fun outputFile(buf: String, file_name: String){
        val outputFile = File(file_name)
        val fw = FileWriter(outputFile)
        fw.write(buf)
        fw.close()
    }
}
