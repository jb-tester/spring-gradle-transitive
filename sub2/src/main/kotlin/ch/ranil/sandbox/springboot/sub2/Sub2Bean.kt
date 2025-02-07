package ch.ranil.sandbox.springboot.sub2

import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class Sub2Bean {
    fun getDateTime(): String = LocalDateTime.now().toString()
}
