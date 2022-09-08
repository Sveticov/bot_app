package com.svetikov.bot_app.controlle

import com.svetikov.bot_app.ModelT
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
@CrossOrigin("http://localhost:4200/")
@RestController
class BotController {
    var idCount = 0
    @GetMapping("/my_bot/{id}")
    fun myBot(@PathVariable id: Int): String {
        ModelT().apply {
            some = "start"
            printAnyWhere()
            some = "stop"
            printAnyWhere()
        }
        return "New id: $id"
    }

    @GetMapping("/person")
    fun getPerson(): Person {
        idCount++
        return Person(idCount, "Test", 12)
    }
}

data class Person(
        val i: Int,
        val s: String,
        val i1: Int)
