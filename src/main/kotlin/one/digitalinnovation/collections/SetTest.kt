package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("Joao", 1000.00, "Operario")
    val maria = funcionario("Maria", 30000.00, "Diretor Executivo")
    val pedro = funcionario("Pedro", 3000.00, "Operario")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{
        println(it)
    }
}
//subtract and intersect can be used like union but with different results