package io.github.hellorin.graphqlmongoexplorer

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.runApplication

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}