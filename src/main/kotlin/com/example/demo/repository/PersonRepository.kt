package com.example.demo.repository

import com.example.demo.model.Person
import org.springframework.data.repository.CrudRepository

interface PersonRepository : CrudRepository<Person, Long>