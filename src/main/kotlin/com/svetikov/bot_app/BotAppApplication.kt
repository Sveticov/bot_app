package com.svetikov.bot_app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BotAppApplication

fun main(args: Array<String>) {
    runApplication<BotAppApplication>(*args)
}
