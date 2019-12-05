package com.github.korosuke613.bwdm.boundaryValueAnalysisUnit

import com.github.korosuke613.bwdm.domainAnalysis.DomainAnalyser
import com.github.korosuke613.bwdm.informationStore.IfElseExprSyntaxTree
import com.github.korosuke613.bwdm.informationStore.InformationExtractor
import java.util.*

class BvaUnitMain(private val ie: InformationExtractor, isPairwise: Boolean) {
    private val expectedOutputDataGenerator: ExpectedOutputDataGenerator
    val boundaryValueAnalyzer: BoundaryValueAnalyzer = BoundaryValueAnalyzer(ie, isPairwise)

    val allTestcasesByBv: String
        get() {
            val buf = StringBuilder()
            val parameters = ie.parameters
            val inputDataList = boundaryValueAnalyzer.inputDataList
            val expectedOutputDataList = expectedOutputDataGenerator.expectedOutputDataList


            for (i in expectedOutputDataList.indices) {
                buf.append("No.").append(i + 1).append(" : ")
                val inputData = inputDataList[i]
                for (prm in parameters) {
                    buf.append(inputData[prm]).append(" ")
                }
                buf.append("-> ").append(expectedOutputDataList[i]).append("\n")
            }

            return buf.toString()
        }

    init {
        expectedOutputDataGenerator = ExpectedOutputDataGenerator(
                ie,
                Objects.requireNonNull<IfElseExprSyntaxTree>(ie.ifElseExprSyntaxTree).root,
                boundaryValueAnalyzer.inputDataList
        )
    }


}