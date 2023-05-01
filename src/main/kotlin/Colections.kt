fun main() {
    // Code lab Collections
    // https://developer.android.com/codelabs/basic-android-kotlin-collections?hl=pt-br#0

    val rockPlanets = arrayOf("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem = rockPlanets + gasPlanets

    /**
     * Cant add new items in arrays, for that Lists or copy arrays to new ones
    solarSystem[8]= "Pluto"
    */

    val enhancedSolarSystem = solarSystem + "Pluto"

    enhancedSolarSystem.map {
        println(it)
    }

    val solarSystemList = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    println(solarSystemList.size)
    println(solarSystemList[2])
    println(solarSystemList.get(3))
    println(solarSystemList.indexOf("Earth"))
    println(solarSystemList.indexOf("Pluto")) // Nãao tem na lista retorna -1

    for ( planet in solarSystemList) {
       println("${solarSystemList.indexOf(planet)} ---> $planet")
    }


    val mutableSolarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    mutableSolarSystem.add("Pluto")
    mutableSolarSystem.add(3,"Theia")
    mutableSolarSystem[3] = "Future Moon"

    println(mutableSolarSystem[3])
    println(mutableSolarSystem[9])

    mutableSolarSystem.removeAt(9)
    mutableSolarSystem.remove("Future Moon")

    println(mutableSolarSystem.contains("Pluto"))
    println("Future Moon" in mutableSolarSystem)

    val k = "Kotlin".hashCode()
    val kk = "Kotlin!".hashCode()

    println(k)
    println(kk)

    val solarSystemSet = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystemSet.size)

    solarSystemSet.add("Pluto")
    println(solarSystemSet.size)

    println(solarSystemSet.contains("Pluto"))
    println("Pluto" in solarSystemSet)

    solarSystemSet.add("Pluto")
    println(solarSystemSet.size)

    solarSystemSet.remove("Pluto")
    println(solarSystemSet.size)
    println("Pluto" in solarSystemSet)


    val solarSystemMap = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
    println(solarSystemMap.size)

    solarSystemMap["Pluto"] = 5

    println(solarSystemMap.size)

    println(solarSystemMap["Pluto"])

    println(solarSystemMap["Theia"])
}

