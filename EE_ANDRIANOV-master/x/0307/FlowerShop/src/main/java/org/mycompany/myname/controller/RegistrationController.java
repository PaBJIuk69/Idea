package org.mycompany.myname.controller;

import org.mycompany.myname.entity.User;
import org.mycompany.myname.service.UserService;
import org.mycompany.myname.util.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class RegistrationController {

    @Autowired
  private UserService userService;



    @GetMapping("/registration")
    public String registration (Model model){
        model.addAttribute("user",new User());
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser (@ModelAttribute ("user") User user){
        userService.save(user);
        return "redirect:/login";
    }

    @GetMapping ("/")
    public String main (){
        return "loginUser";
    }

    @RequestMapping("/login")
    public String login (){
        return "loginUser";
    }

}