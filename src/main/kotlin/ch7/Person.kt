package org.example.ch7

// 코틀린 방식 -> 값이 채워져야만 객체 유지 가능 -> 좀 더 안정적
// 스프링도 autowired 대신 생성자 주업 권장과 비슷한 논리
class Person(
    val name: String
) {

    fun greet() {
        println("Hello, my name is $name")
    }
}

fun main() {
    val person = Person("Alice")
    person.greet()
}


// 자바 방식 -> 값이 없어도 객체 유지 가능
//class Person {
//
//    var name: String = ""
//
//    constructor(name: String) {
//        this.name = name
//    }
//
//    fun greet() {
//        println("Hello, my name is $name")
//    }
//}
//
//fun main() {
//    val person = Person("Alice")
//    person.greet()
//}