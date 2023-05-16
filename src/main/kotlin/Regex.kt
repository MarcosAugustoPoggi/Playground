fun main() {

    val pattern: Regex = "kk|ab".toRegex()

    var aba = "abbabc"
    var match = pattern.find(aba)
    if (match != null) {
        println(match.value)
    }


}