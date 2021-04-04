package me.clept.api.collections

fun main() {
    val joao = Funcionario(name = "João", salario = 1000.0, tipocontrato = "CLT")
    val maria = Funcionario(name = "Maria", salario = 1500.0, tipocontrato = "PJ")
    val pedro = Funcionario(name = "Pedro", salario = 1200.0, tipocontrato = "CLT")

    val funcionarios = listOf(joao, maria, pedro)

    funcionarios.forEach { println(it) }
    println("--------")
    println(funcionarios.find { it.name == "Maria" })

    println("--------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("--------")
    funcionarios.groupBy { it.tipocontrato }.forEach{ println(it)}

    println("--------")

}

data class Funcionario(
    val name: String,
    val salario: Double,
    val tipocontrato: String
){
    override fun toString(): String =
        """
      Salário de $name é R$ $salario, tipo do contrato $tipocontrato
        """.trimIndent()
}