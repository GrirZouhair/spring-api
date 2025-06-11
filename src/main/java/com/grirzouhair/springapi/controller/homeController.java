package com.grirzouhair.springapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @RequestMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("name", "Zouhair");
        return "index";
    }
}
