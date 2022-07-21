package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("Joao", 1000.00, "Operario")
    val maria = funcionario("Maria", 30000.00, "Diretor Executivo")
    val pedro = funcionario("Pedro", 3000.00, "Operario")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach {
        println(it)
        space()
    }

    funcionarios.remove(joao)
    funcionarios.add(pedro)
    funcionarios.forEach {
        println(it)
        space()
        space()
    }

    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.add(maria)
    funcionarioSet.add(pedro)
    funcionarioSet.forEach{println(it)}
}