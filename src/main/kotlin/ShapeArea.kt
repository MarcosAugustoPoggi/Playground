fun main() {
    println(solutionShape(5))
}

fun solutionShape(n: Int): Int {
    val modulo = n - 1
    val maxLinearLenght = (modulo * 2) + 1
    var count = modulo
    var extras = 0

    while(count > 1) {
        extras += --count * 4
    }

    return ((maxLinearLenght * 2) - 1) + extras
}

