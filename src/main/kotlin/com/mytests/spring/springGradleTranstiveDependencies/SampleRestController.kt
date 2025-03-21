package com.mytests.spring.springGradleTranstiveDependencies

import com.mytests.spring.springGradleTranstiveDependencies.sub1.Sub1Bean1
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleRestController(
    private val sub1Bean1: Sub1Bean1
) {

    @GetMapping("/hello")
    fun hello() = "Hello, ${sub1Bean1.getDateTimeInfo()}"
}
