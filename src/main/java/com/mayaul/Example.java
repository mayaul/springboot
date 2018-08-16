package com.mayaul;

import com.mayaul.listener.MyListener;
import com.mayaul.service.HelloMessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigServer
@SpringBootApplication
public class Example {

    private final HelloMessageService helloMessageService;

    public Example(final HelloMessageService helloMessageService) {
        this.helloMessageService = helloMessageService;
    }

    @RequestMapping("/")
    public String home() {
        return helloMessageService.getMessage();
    }

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Example.class);
        springApplication.addListeners(new MyListener());
        springApplication.run(args);
//        SpringApplication.run(Example.class, args);
    }

}