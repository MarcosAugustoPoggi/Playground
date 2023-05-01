fun solutionJavaLike(inputArray: MutableList<Int>): Int {
    val minValue = inputArray[0] * inputArray[1]
    var maxValue = minValue

    for (i in 0 until inputArray.size - 1) {
        val current = inputArray[i]
        val next = inputArray[i + 1]
        val product = current * next

        if (product > maxValue) {
            maxValue = product
        }
    }
    return maxValue
}

fun solutionKotlin(inputArray: MutableList<Int>): Int {
    val product = (0 until inputArray.lastIndex).map {
        inputArray[it] * inputArray[it+ 1]
    }
    return product.maxOf { it }
}

fun main() {
    val myList = mutableListOf(27, 3, 22, 7, -10)
    println(solutionJavaLike(myList))
    println(solutionKotlin(myList))
}