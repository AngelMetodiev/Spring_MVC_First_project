package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BroController {
    @RequestMapping("/cricket")
    public String giveBat() {
        return "MRFCricketbat";
    }
}
