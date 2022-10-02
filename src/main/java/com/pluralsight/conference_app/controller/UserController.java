package com.pluralsight.conference_app.controller;

import com.pluralsight.conference_app.Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("user")
    public User getUser(@RequestParam(value = "name", defaultValue = "Mohamed") String name,
                        @RequestParam(value = "age", defaultValue = "22") int age) {
        User newUser = new User(name, age);
        return newUser;
    }

    @PostMapping("user")
    public User addUser(@RequestParam(value = "name", defaultValue = "Mohamed") String name,
                        @RequestParam(value = "age", defaultValue = "22") int age) {
        User newUser = new User(name, age);
        return newUser;
    }
}
