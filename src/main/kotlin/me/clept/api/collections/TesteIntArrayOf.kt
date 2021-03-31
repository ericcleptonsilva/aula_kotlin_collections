package me.clept.api.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 10, 12)

    values.forEach {
        println(it)
    }
    println()
    println("------")
    values.sort()
    values.forEach {
        println(it)
    }

}