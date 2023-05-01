fun palindromo(inputString: String): Boolean {
    return inputString.reversed() == inputString
}


fun main() {
    println(palindromo("cabeça"))
}
