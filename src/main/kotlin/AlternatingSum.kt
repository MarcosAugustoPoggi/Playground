fun main() {
    val row = mutableListOf(50, 60, 60, 45, 70)
    println(row)
    println(solutionAS(row))
}

fun solutionAS(a: MutableList<Int>): MutableList<Int> {
    val sum = mutableListOf<Int>(0,0)
    for ((index, peopleWeight) in a.withIndex()) {
        if (index % 2 == 0) sum[0] += peopleWeight else sum[1] += peopleWeight
    }

    return sum
}
