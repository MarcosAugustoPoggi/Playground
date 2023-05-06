fun main() {
    val matrix = mutableListOf(
        mutableListOf(0, 1, 1, 2),
        mutableListOf(0, 5, 0, 0),
        mutableListOf(2, 0, 3, 3)
    )
    solutionMatrix(matrix)
}


fun solutionMatrix(matrix: MutableList<MutableList<Int>>): Int {
    var sum = 0
    val hauntedColluns = mutableListOf<Int>()

    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            if (matrix[i][j] == 0){
                hauntedColluns.add(j)
            }
            if (!hauntedColluns.contains(j)) {
                sum += matrix[i][j]
            }
        }
    }
    return sum
}