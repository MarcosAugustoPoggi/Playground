fun main() {
    solutionIsLucky(1230)
}


fun solutionIsLucky(n: Int): Boolean {
    val digits = n.toString().length

    val second = n.toString().substring(digits / 2)
    val first = n.toString().substring(0..(digits / 2) - 1)

    var firstSum = 0
    var secondSum = 0

    first.forEach {
        val i = it.digitToIntOrNull()
        if (i != null) {
            firstSum += i
        }
    }

    second.forEach {
        val i = it.digitToIntOrNull()
        if (i != null) {
            secondSum += i
        }
    }

    return (firstSum == secondSum)
}
