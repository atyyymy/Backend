package com.example.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author Wei
 * @Date 2022/12/29 11:08
 * @Version 1.0
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/helloworld")
    public String HelloWorld(){
        return "Hello World";
    }
}
