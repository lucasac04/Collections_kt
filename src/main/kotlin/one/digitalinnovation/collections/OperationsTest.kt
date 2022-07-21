package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(2000.00, 2000.00, 3000.00)

    salarios.forEach { println(it) }

    space()
    println("Mario salario: ${salarios.maxOrNull()}")
    println("Clovis salario: ${salarios.minOrNull()}")
    println("Media salarios: ${salarios.average()}")
    println("Salarios maiores que 2500: ${salarios.filter {it > 2500}}")

    space()
    println(salarios.count {it in 2000.00..5000.00})

    space()
    println(salarios.find {it == 2000.00})
}

