package com.kipngeno.SimpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Welcome to Kipngeno's!!!";
    }
    @RequestMapping("/about")
    public String about() {
        return "We don't teach , We Educate!!!";
    }
}
