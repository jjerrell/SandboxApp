package dev.jjerrell.sandbox.client

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform