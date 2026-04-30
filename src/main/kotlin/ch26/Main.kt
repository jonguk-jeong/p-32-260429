package org.example.ch26


fun main() {
    val str = "Hello".also {
        println("Before: $it")
    }.uppercase().also {
        println("After: $it")
    }

    println("rst : ${str}")

//    val post = Post().apply {
//        id = 1
//        title = "sdfdsdf"
//        content = "sdfsdf"
//    }
//        .also {
//            postRepository.save(it)
//        }
//    return post;


    // apply => this를 받고 객체를 반환
    // let => it을 받고 람다의 결과값 반환
    // also => it을 받고 객체를 반환
}