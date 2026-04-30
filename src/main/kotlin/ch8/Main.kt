package org.example.ch8


fun main() {
//    val names = listOf("Alice", "Bob", "Charlie")         // 불변 리스트
    val names = mutableListOf("Alice", "Bob", "Charlie")    // 가변 리스트

    names.add("Daniel")

    for (name in names) {
        println(name)
    }

}