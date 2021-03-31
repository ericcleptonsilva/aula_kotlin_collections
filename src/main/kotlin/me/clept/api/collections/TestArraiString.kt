package me.clept.api.collections

fun main() {
    val names = Array(4){""}

    names[0] = "Maria"
    names[1] = "João"
    names[2] = "José"
    names[3] = "Eric"

    for (name in names){
        println(name)
    }
    println("---")
    println()
    names.sort()
    names.forEach { println(it) }

    println("---")
    println()
    val names2 = arrayOf("Ricaro", "Fernada", "Zazá")
    names2.sort()
    names2.forEach { println(it) }
}