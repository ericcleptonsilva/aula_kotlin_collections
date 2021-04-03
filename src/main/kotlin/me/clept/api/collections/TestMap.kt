package me.clept.api.collections

fun main() {
    val pair: Pair<String, Double> = Pair("João", 2500.0)
    val map1 = mapOf(pair)

    println("-------")
    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
    println("-------")

    val map2 = mapOf(
        "Pedro" to 1000.00,
        "Maria" to 5000.00
    )
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
    println("-------")



}