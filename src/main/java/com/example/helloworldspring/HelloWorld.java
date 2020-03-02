package com.example.helloworldspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by cicek on 04.07.2019 16:48
 */


@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String index(){
        return "Hello World";
    }
}