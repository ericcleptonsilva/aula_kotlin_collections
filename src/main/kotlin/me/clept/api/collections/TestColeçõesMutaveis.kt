package me.clept.api.collections

fun main() {
    val joao = Funcionario(name = "João", salario = 1000.0, tipocontrato = "CLT")
    val maria = Funcionario(name = "Maria", salario = 1500.0, tipocontrato = "PJ")
    val pedro = Funcionario(name = "Pedro", salario = 1200.0, tipocontrato = "CLT")

    println("------List------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }


    println("------SET------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }
    println("------------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("------------")

    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }

    println("------------")
}