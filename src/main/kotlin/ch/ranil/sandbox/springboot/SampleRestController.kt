package ch.ranil.sandbox.springboot

import ch.ranil.sandbox.springboot.sub1.Sub1Bean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleRestController(
    private val sub1Bean: Sub1Bean
) {

    @GetMapping("/hello")
    fun hello() = "Hello, ${sub1Bean.getDateTimeInfo()}"
}
