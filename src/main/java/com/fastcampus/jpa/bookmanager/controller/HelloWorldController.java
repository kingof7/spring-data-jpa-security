package com.fastcampus.jpa.bookmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jhlee
 * @since 2021/09/25
 */
//rest api의 요청을 받을 수 있는 애노테이션
@RestController
public class HelloWorldController {
    
    //Http Method를 Get으로 받겠다는 애노테이션
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "hello-world";
    }

}
