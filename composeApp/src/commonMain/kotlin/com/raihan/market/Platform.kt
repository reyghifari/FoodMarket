package com.raihan.market

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform