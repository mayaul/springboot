package com.mayaul.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HelloMessageService {

    public String getMessage() {
        log.info("info level message");
        return "Hello, Spring boot 2.0";
    }
}
