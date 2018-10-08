package com.yershalom.androidKotlinMpp

expect fun platformName(): String

fun createApplicationScreenMessage(): String {
    return "Kotlin running on ${platformName()}"
}