
fun main() {
    val input =  "foo(bar(baz))blim" // foo(bar)baz (bar) foo(bar(baz))blim "()"
    println("input  = $input")
    println(solutionRIP(input))
}

fun solutionRIP(inputString: String): String {
    val pattern = "\\(([^()]*)\\)".toRegex()

    var changedString = inputString
    var match = pattern.find(changedString)

        while (match != null) {
            val old = match.value
            val new = old.substring(1, old.length - 1).reversed()
            changedString = changedString.replace(old, new)
            match = pattern.find(changedString)
        }
    return changedString
}