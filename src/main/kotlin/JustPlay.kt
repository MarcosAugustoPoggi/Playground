fun main() {
    // Collections with builder functions
    val map = buildMap {
        put("a", 1)
        put("b", 4)
        put("c", 8)
    }
    val myMutable = map.toMutableMap()
    myMutable["z"] = 99

    println(map)
    println(myMutable)

    //Iterator
    val numbers = listOf("one", "two", "three", "four")
    val numbersIterator = numbers.iterator()
    while (numbersIterator.hasNext()) {
        println(numbersIterator.next())
        println(numbersIterator.next())
        println(numbersIterator.hasNext())

        numbersIterator.forEachRemaining {
            println("Remaining $it")
        }
        println(numbersIterator.hasNext())
    }

    //for loop
    for (item in numbers) {
        println("for loop -> ${item}")
    }

    //forEach
    numbers.forEach {
        println("for each => $it")
    }

    //list iterator -  It supports iterating lists in both directions: forwards and backwards
    val listIterator = numbers.listIterator()
    while (listIterator.hasNext()) listIterator.next()
    println("Iterating backwards:")
    while (listIterator.hasPrevious()) {
        print("Index: ${listIterator.previousIndex()}")
        println(", value: ${listIterator.previous()}")
    }

    //mutable list iterator
    val numbersMutable = mutableListOf("one", "four", "four")
    val mutableListIterator = numbersMutable.listIterator()

    mutableListIterator.next()
    mutableListIterator.add("two")
    mutableListIterator.next()
    mutableListIterator.set("three")
    println(numbers)

}