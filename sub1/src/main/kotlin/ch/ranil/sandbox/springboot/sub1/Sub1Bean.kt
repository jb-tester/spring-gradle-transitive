package ch.ranil.sandbox.springboot.sub1

import ch.ranil.sandbox.springboot.sub2.Sub2Bean
import org.springframework.stereotype.Service

@Service
class Sub1Bean(
    private val sub2Bean: Sub2Bean
) {
    fun getDateTimeInfo(): String = "it's ${sub2Bean.getDateTime()}"
}
