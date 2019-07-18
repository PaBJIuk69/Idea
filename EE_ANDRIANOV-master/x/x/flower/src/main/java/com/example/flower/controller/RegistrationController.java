package com.example.flower.controller;


import com.example.flower.dao.UserDao;
import com.example.flower.model.Role;
import com.example.flower.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

@Controller
public class  RegistrationController {

    @Autowired
  private UserDao userDao;

    @GetMapping("/")
    public String greeting( String name, Model model) {
        return "greeting";
    }

    @GetMapping("/main")
    public String main (Model model){
        model.addAttribute("some","Welcome Flower Shop !!!");
        return "main";
    }

    @GetMapping("/registration")
    public String registration (){
        return "registration";
    }
    @PostMapping ("/registration")
    public String addUser (User user, Map<String,Object> model){
        User userFormDb = userDao.findByUsername(user.getUsername());
        if (userFormDb != null){
            model.put("message","User exists");
            return "registration";
        }
        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        userDao.save(user);
        return "redirect:/flower";
    }

}