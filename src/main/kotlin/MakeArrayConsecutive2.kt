fun main() {
    val statues = mutableListOf(6, 2, 3, 8)
    println(solution(statues))
    println(solutionShorter(statues))
}


fun solutionShorter(statues: MutableList<Int>): Int {
    val statuesRange = statues.min()..statues.max()
    return statuesRange.map { it }.size - statues.size
}

fun solution(statues: MutableList<Int>): Int {
    val statuesSorted = statues.sorted()
    val first = statuesSorted.first()
    val last = statuesSorted.last()

    val consecutiveList = first..last
    val totalStatues = consecutiveList.map { it }

    return totalStatues.size - statues.size
}