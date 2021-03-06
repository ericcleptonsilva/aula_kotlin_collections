package me.clept.api.collections

import java.io.StringReader

class Repository <T> {
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T){
        map[id] = value }

    fun findById(id: String) = map[id]
    fun remove(id: String) = map.remove(id)

    fun findAll() = map.values





}