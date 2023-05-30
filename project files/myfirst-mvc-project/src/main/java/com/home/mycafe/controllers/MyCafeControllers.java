package com.home.mycafe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyCafeControllers {
    @RequestMapping("/cafe")
    public String showWelcomePage() {
        //sending data to view(jsp page)
        return "welcome-page";
    }

    @RequestMapping("/processOrder")
    public String processOrder(HttpServletRequest request, Model model) {
        //handle the data received from the user
        String userEnteredValue = request.getParameter("foodType");
        //adding the captured value to the model
        model.addAttribute("userInput", userEnteredValue.toUpperCase());
        //set the user data with the model object and send it to view
        return "process-order";
    }
}
