package com.springboot.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstApplication {

//maste1
    //dev1
    //master2
    @RequestMapping("/")
    String index() {
        System.out.println("jiangjianggongping");
        return "Hello Spring Boot";
    }
    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class, args);
    }

}
