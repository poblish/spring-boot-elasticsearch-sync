package com.example.demo.api

import com.example.demo.model.Person
import com.example.demo.repository.PersonRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EntityController(private val persons: PersonRepository) {

    @GetMapping("/")
    fun test() = run {
        val entity = Person(null, "Andrew", "Regan");
        persons.save(entity)
        "Saved $entity"
    }
}