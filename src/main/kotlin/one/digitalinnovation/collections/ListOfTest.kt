package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("Joao", 1000.00, "Operario")
    val maria = funcionario("Maria", 30000.00, "Diretor Executivo")
    val pedro = funcionario("Pedro", 3000.00, "Operario")

    val funcionarios = listOf(joao, maria, pedro)
    funcionarios.sortedBy { it.salario }.forEach{
        println(it)
        space()
    }
    funcionarios.groupBy { it.cargo }.forEach{
        println(it)
        space()
    }

}


