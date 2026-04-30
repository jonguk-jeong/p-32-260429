package org.example.ch25


class Person(
    var name: String = "",
    var age: Int = 0
) {

    fun addAge() {
        age += 1
    }

    fun printInfo() {
        println("Name: $name, Age: $age")
    }
}

fun main() {

    val person1 = Person()
    person1.name = "Alice"
    person1.age = 25

    person1.printInfo()

//    val person2 = Person().apply {
//        name = "Alice"
//        age = 25
//        addAge()
//    }

    val rst = Person().let {
        it.name = "Alice"
        it.age = 25
        it.addAge()

        it.age + 10
    }

    val rst2 = Person()
        .apply {
            name = "Alice"
            age = 25
        }.let {
            it.age + 10
        }

    println(rst2)

}