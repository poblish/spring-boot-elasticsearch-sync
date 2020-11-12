package com.example.demo.model

import org.hibernate.search.mapper.pojo.mapping.definition.annotation.GenericField
import org.hibernate.search.mapper.pojo.mapping.definition.annotation.Indexed
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

// FIXME Really don't want to pollute our entities with search stuff
@Indexed
@Entity
class Person(@Id @GeneratedValue(strategy = GenerationType.SEQUENCE) val id: Long?,
             @GenericField val forename: String,
             @GenericField val surname: String,
             @GenericField val age: Int = 21)