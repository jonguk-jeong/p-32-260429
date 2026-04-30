package org.example.ch12

// data class 사용
// 자바의 record와 유사
data class Person(
    val name: String,
    val age: Int
) {}

fun main() {
    val p1 = Person("Alice", 29)
    val p2 = Person("Alice", 29)

    println(p1)  // 자동 생성된 toString() 메서드 사용
    println(p1 == p2) // 자동 생성된 equals() 메서드 사용. ==로 사용해도 된다.
}


// data class 없이 구현
//class Person(val name:String, val age:Int) {
//
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (other !is Person) return false
//
//        return name == other.name && age == other.age
//    }
//
//    override fun toString(): String {
//        return "Person(name='$name', age=$age)"
//    }
//}
//
//fun main() {
//    val p1 = Person("Alice", 29)
//    val p2 = Person("Alice", 29)
//
//    println(p1)  // 자동 생성된 toString() 메서드 사용
//    println(p1 == p2) // 자동 생성된 equals() 메서드 사용. ==로 사용해도 된다.
//}