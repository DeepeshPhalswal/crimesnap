package com.example.crimesnap

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform