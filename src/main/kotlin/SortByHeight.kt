fun main() {
    val l = mutableListOf<Int>(-1, 150, 190, 170, -1, -1, 160, 180)
    println("Expected: [-1, 150, 160, 170, -1, -1, 180, 190]")
    println(solutionSBH(l))
}


fun solutionSBH(a: MutableList<Int>): MutableList<Int> {

    val subList = a.filter { it != -1 }.sorted()
    val heightSorted = mutableListOf<Int>()
    var subsCount = 0

    a.forEach { item ->
        if (item == -1) {
            heightSorted.add(item)
        } else {
            heightSorted.add(subList[subsCount])
            subsCount++
        }
    }

    return heightSorted
}