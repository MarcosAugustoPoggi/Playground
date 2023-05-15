fun main() {
    val picture = mutableListOf("abc", "ded")
    println(solutionAB(picture))
}

fun solutionAB(picture: MutableList<String>): MutableList<String> {
    val result = mutableListOf<String>()
    val firstAndLast = "*".repeat(picture[0].length + 2)
    result.add(firstAndLast)
    for (word in picture) {
        result.add("*$word*")
    }
    result.add(firstAndLast)
    return result
}
