package ru.javabegin.micro.demo.eurekaclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new") // корневой URI
public class NewController {

    @GetMapping("/name")
    public String test(){
        return "micro service number 2";
    }

}
