package me.clept.api.collections

fun main() {
    val joao = Funcionario(name = "João", salario = 1000.0, tipocontrato = "CLT")
    val maria = Funcionario(name = "Maria", salario = 1500.0, tipocontrato = "PJ")
    val pedro = Funcionario(name = "Pedro", salario = 1200.0, tipocontrato = "CLT")

    val repository = Repository<Funcionario>()
    repository.create(joao.name, joao)
    repository.create(pedro.name, pedro)
    repository.create(maria.name, maria)

    println(repository.findById(joao.name))
}