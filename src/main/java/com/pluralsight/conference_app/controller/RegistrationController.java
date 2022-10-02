package com.pluralsight.conference_app.controller;


import com.pluralsight.conference_app.Model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegistrationController {
    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration) {

        return "registration";
    }
    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute("registration") Registration registration,
                                  BindingResult result) {
        if (result.hasErrors()) {
            System.out.println("Error Occurred!");
            return "registration";
        }
        System.out.println(registration.getName());
        return "redirect:registration";
    }
}
