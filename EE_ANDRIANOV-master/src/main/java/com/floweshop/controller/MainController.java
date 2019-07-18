package com.floweshop.controller;

import com.floweshop.domain.User;
import com.floweshop.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {
    @Autowired
    UserRepo userRepo;

    @GetMapping("/")
    public String greeting( Map<String,Object> model) {
        return "greeting";
    }

    @GetMapping("/main")
    public String main (Model model ){

        return "main";

    }


}
