package com.grirzouhair.springapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/admin")
@RestController
public class RoleController {
    @GetMapping("/hi")
    public String SayHello() {
        return "Hello Admin";
    }
}
