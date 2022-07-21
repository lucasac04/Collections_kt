package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Marioa"
    nomes[1] = "Zaza"
    nomes[2] = "Jose"

    for (nome in nomes) {
        println(nome)
    }

space()
    nomes.sort()
    nomes.forEach { println(it) }

space()
    val nomes2 = arrayOf("Mario", "Zaza", "Jose")
    nomes2.sort()
    nomes2.forEach { println(it) }
}