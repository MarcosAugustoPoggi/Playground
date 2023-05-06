fun main() {
    val stringsArray = mutableListOf<String>("aba", "aa", "ad", "vcd", "aba")
    solutionALS(stringsArray)
}

fun solutionALS(inputArray: MutableList<String>): MutableList<String> {
    val outputArray = mutableListOf<String>()
    var maxLenght = 0

    for (word in inputArray) {
        if (word.length > maxLenght) {
            maxLenght = word.length
        }
    }

    inputArray.forEach { word ->
        if (word.length == maxLenght) {
            outputArray.add(word)
        }
    }

    return outputArray
}