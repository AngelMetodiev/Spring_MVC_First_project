package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {
    //we want to map this controller with an url “/sugar”.
//So this controller will handle a request called /sugar, and we have to use @RequestMapping for this
//create a request handler method
    @ResponseBody //it will make our method to return the result to our web page
    @RequestMapping("/sugar")
    public String giveSugar() {
        return "Ok...here is your sugar";
    }
}
