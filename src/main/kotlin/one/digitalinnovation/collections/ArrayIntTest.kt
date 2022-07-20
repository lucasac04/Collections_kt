package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 7
    values[1] = 2
    values[2] = 8
    values[3] = 4
    values[4] = 5

    for(valor in values) {
        println(valor)
    }

    space()
    values.forEach {
        println(it)
    }

    space()
    for (index in values.indices){
        println(values[index])
    }

    space()
    values.sort()
    for(valor in values){
        println(valor)
    }
}

