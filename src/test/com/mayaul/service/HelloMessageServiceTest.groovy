package com.mayaul.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import spock.lang.Specification

@SpringBootTest
class HelloMessageServiceTest extends Specification {
    @Autowired
    private ApplicationContext applicationContext

    def "contextLoads"() {
        expect:
        this.applicationContext != null
    }
}
