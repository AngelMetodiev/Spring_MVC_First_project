package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {
    @ResponseBody// it will make our method to return the result to our web page
    @RequestMapping("/makeup")
    public String getMakeup() {
        return "Just take my makeup kit!";
    }
    @ResponseBody// it will make our method to return the result to our web page
    @RequestMapping("/book")
    public String getBooks() {
        System.out.println("This is getBooks() method...");
        return "I`m giving you a Math book!";
    }
}
