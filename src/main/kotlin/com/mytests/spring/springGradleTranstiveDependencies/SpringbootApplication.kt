package com.mytests.spring.springGradleTranstiveDependencies

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootApplication

fun main(args: Array<String>) {
    runApplication<SpringbootApplication>(*args)
}
