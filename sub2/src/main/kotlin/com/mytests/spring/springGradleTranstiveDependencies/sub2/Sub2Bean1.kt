package com.mytests.spring.springGradleTranstiveDependencies.sub2

import com.mytests.spring.springGradleTranstiveDependencies.sub3.Sub3Bean1
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class Sub2Bean1(private val sub3Bean1: Sub3Bean1) {
    fun getDateTime(): String = LocalDateTime.now().toString()
          fun getSub3Bean1Id() = sub3Bean1.getId()
}
