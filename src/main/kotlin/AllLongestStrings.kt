fun main() {
    val stringsArray = mutableListOf("aba", "aa", "ad", "vcd", "aba")
    solutionALS(stringsArray)
}

fun solutionALS(inputArray: MutableList<String>): MutableList<String> {
    val outputArray = mutableListOf<String>()
    var maxLength = 0

    for (word in inputArray) {
        if (word.length > maxLength) {
            maxLength = word.length
        }
    }

    inputArray.forEach { word ->
        if (word.length == maxLength) {
            outputArray.add(word)
        }
    }

    return outputArray
}