package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("Joao", 1000.00, "Operario")
    val maria = funcionario("Maria", 30000.00, "Diretor Executivo")
    val pedro = funcionario("Pedro", 3000.00, "Operario")

    val repositorio = Repositorio<funcionario>()
    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    space()
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach {
        println(it)
    }
}