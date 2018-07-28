package com.mayaul.service;

import org.springframework.stereotype.Service;

@Service
public class HelloMessageService {

    public String getMessage() {
        return "Hello, Spring boot 2.0";
    }
}
