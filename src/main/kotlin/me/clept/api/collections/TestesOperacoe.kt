package me.clept.api.collections

fun main() {
    val salarios = doubleArrayOf(1000.0,2000.0,4500.0)

    for (salario in salarios){
        println(salario)
    }
    println("------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Mmenor salário: ${salarios.minOrNull()}")
    println("Média salárial: ${salarios.average()}")

    val salariosMarioQue25000 = salarios.filter { it > 2500.00 }
    println("--------")
    salariosMarioQue25000.forEach { (println("Salário mario que R$2500.00 é R$${it}")) }

    println("--------")
    println("temos apenas ${salarios.count { it in 2000.0..5000.0 }} salário(os) mais altos!")

    println("--------")
    println("Sálarios mais alto: ${salarios.find { it == salarios.maxOrNull()}}")
    println("Sálarios mais baixo: ${salarios.find { it == salarios.minOrNull()}}")
    println(salarios.any{it == 1000.0})
    println(salarios.any{it == 500.0})
}