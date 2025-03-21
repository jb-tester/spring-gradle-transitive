package com.mytests.spring.springGradleTranstiveDependencies.sub1

import com.mytests.spring.springGradleTranstiveDependencies.sub2.Sub2Bean1
import org.springframework.stereotype.Service

@Service
class Sub1Bean1(
    private val sub2Bean1: Sub2Bean1
) {
    fun getDateTimeInfo(): String = "it's ${sub2Bean1.getDateTime()}"
}
