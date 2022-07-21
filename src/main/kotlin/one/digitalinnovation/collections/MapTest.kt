package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Joao", 100.00)
    val map1 = mapOf(pair)
    map1.forEach{ (k, v) -> println("Key $k - Valor $v")}

    space()
    val map2 = mapOf(
        "Pedro" to 2000.00,
        "Maria" to 3000.00
    ) // Pedro = Key and 2000.00 = Valor
    map2.forEach{ (k, v) -> println("Key $k - Valor $v")}

}