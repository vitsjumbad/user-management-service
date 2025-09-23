package com.techmandi.user_management_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users")
    public String getUsers() {
        return "User Management Service is UP AGAIN! 🚀";
    }
}
