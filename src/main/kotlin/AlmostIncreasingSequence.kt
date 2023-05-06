fun main() {
    val seq1 = mutableListOf(1, 3, 2, 1) // False
    val seq2 = mutableListOf(1, 3, 2) // True
    val seq3 = mutableListOf(1, 2, 1, 2) // False
    val seq4 = mutableListOf(3, 6, 5, 8, 10, 20, 15) // False
    val seq5 = mutableListOf(1, 1, 2, 3, 4, 4) // False
    val seq6 = mutableListOf(1, 4, 10, 4, 2) // False
    val seq7 = mutableListOf(1, 4, 10, 4, 2) // False
    val seq8 = mutableListOf(1, 1, 1, 2, 3) // False
    val seq9 = mutableListOf(0, -2, 5, 6) // True
    val seq12 = mutableListOf(1, 1) // True
    val seq13 = mutableListOf(1, 2, 5, 3, 5) // True
    val seq14 = mutableListOf(10, 1, 2, 3, 4, 5) // true
    val seq00 = mutableListOf(1, 2, 3, 4, 5) // true

    val all = listOf(seq1,seq2,seq3,seq4,seq5,seq6,seq7,seq8,seq9,seq12,seq13, seq14,seq00)

    val checkList = all[1]

    println(checkList)
    println(solutionAIS(checkList))
}

fun solutionAIS(sequence: MutableList<Int>): Boolean {
    var count = 0
    for (i in 1 until sequence.size) {
        if (sequence[i] <= sequence[i - 1]) {
            count++
            if (count > 1 || (i > 1 && i < sequence.size - 1 && sequence[i] <= sequence[i - 2] && sequence[i + 1] <= sequence[i - 1])) {
                return false
            }
        }
    }
    return true
}
