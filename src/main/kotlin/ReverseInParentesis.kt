
fun main() {
    val input =  "(abc)d(efg)" // foo(bar)baz (bar) foo(bar(baz))blim "()"
    println(input)
    println(solutionRIP(input))
}

fun solutionRIP(inputString: String): String {
    var indexOfOpen = 0
    var indexOfClose = 0
    var isPreviousOpen = false
    var changedString = inputString

    while (changedString.contains(')')) {
        var index = 0
        for (value in changedString.toCharArray()) {
            if (value == '(') {
                indexOfOpen = index
                isPreviousOpen = true
            }
            if (value == ')') {
                if (isPreviousOpen) {
                    indexOfClose = index
                    val old = changedString.substring(indexOfOpen, indexOfClose) + ')'
                    println("old " + old)
                    val new = changedString.substring(indexOfOpen + 1, indexOfClose).reversed()
                    println("new " + new)
                    changedString = changedString.replace(old, new)
                    println(" string atual "+ changedString)
                    isPreviousOpen = false
                    index = 0
                }
            }
            index++
        }
    }
    return changedString
}

/**
 * fun solution(inputString: String): String {
var indexOfOpen = 0
var indexOfClose = 0
var isPreviousOpen = false
var changedString = inputString

while (changedString.contains(')')) {
var index = 0
for (value in changedString.toCharArray()) {
if (value == '(') {
indexOfOpen = index
isPreviousOpen = true
}
if (value == ')') {
if (isPreviousOpen) {
indexOfClose = index
changedString = changedString.replace(
changedString.substring(indexOfOpen, indexOfClose) + ')',
changedString.substring(indexOfOpen + 1, indexOfClose).reversed()
)
isPreviousOpen = false
index = 0
}
}
index++
}
}
return changedString
}

 *
 */



/**
 *
 *  val indexOfOpen = mutableListOf<Int>()
val indexOfClose = mutableListOf<Int>()

inputString.forEachIndexed { index, char ->
if (char == '(') {
indexOfOpen.add(index)
}
}

var countForClose = 0
var count = 0
inputString.forEachIndexed { index, char ->
if (char == ')') {
indexOfClose.add(index - (countForClose))
count++
countForClose =+ 2
}
}

var changedString = inputString
var round = 0

while (round < indexOfClose.size) {
val openParantesis = indexOfOpen[(indexOfClose.size/2) - round]
val closeParantesis = indexOfClose[round]
val before = changedString.filterIndexed { index, _ -> index < openParantesis }
val invert = (changedString.filterIndexed { index, _ -> (index in (openParantesis + 1) until closeParantesis) }).reversed()
val after = changedString.filterIndexed { index, _ -> index > closeParantesis }
changedString = before + invert + after
round++
}

return changedString
 *
 *
 */