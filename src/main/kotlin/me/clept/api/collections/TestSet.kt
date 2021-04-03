package me.clept.api.collections

fun main() {
    val joao = Funcionario(name = "João", salario = 1000.0, tipocontrato = "CLT")
    val maria = Funcionario(name = "Maria", salario = 1500.0, tipocontrato = "PJ")
    val pedro = Funcionario(name = "Pedro", salario = 1200.0, tipocontrato = "CLT")
    val funcionarios1 = setOf(joao, pedro)
    val funcionario2 = setOf(maria)

    val resultUnio =  funcionarios1.union(funcionario2)
    resultUnio.forEach { println(it)}

    println("--------")
    val funcionarios3 = setOf(maria, joao, pedro)
    val resultSubtract =  funcionarios3.subtract(funcionario2)
    resultSubtract.forEach { println(it) }

    println("--------")
    val resultIntersect = funcionarios3.intersect(funcionario2)
    resultIntersect.forEach { println(it) }

    println("--------")

}