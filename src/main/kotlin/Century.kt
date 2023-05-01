fun solution(year: Int): Int {
    val baseCentury = (year - 1) / 100
    return baseCentury + 1
}

fun main() {
    println(solution(101))
}
