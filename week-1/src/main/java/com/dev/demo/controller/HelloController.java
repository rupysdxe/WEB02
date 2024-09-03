package com.dev.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Rupesh Dangi
 * @date: 2024/08/28 07/44
 */

@Controller
@RequestMapping(value = "/")
public class HelloController {

    @GetMapping
    public String getHelloWorld(){
        return "hello";
    }
}
