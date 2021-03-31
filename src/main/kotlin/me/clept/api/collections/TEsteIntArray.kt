package me.clept.api.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for (valor in values){
        print(valor)

    }

    print("---")
    values.forEach { valor -> print(valor)}
    print("---")
    for (index in values.indices){
        print(values[index])
    }
    print("---")
    values.sort()
    for (valor in values){
        print(valor)
    }


}