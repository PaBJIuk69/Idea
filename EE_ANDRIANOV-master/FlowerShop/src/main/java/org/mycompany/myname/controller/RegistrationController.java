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
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;


@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

//    @Autowired
//    private UserValidator userValidator;

    @GetMapping("/registration")
    public String registration (Model model){
        model.addAttribute("user",new User());
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser (@ModelAttribute @Valid User user, BindingResult result) {
       // userValidator.validate(user,result);
        List<User> userList = userService.findAllUser();
        for (int i = 0; i <userList.size() ; i++) {
            if(user.getUsername().equals(userList.get(i).getUsername())){
                return "registrationError"; }
        }
        if (result.hasErrors()){
            return "registration";
        }
        userService.save(user);
        return "redirect:/flowerShop";
    }

    @GetMapping ("/")
    public String home (){
        return "redirect:/flowerShop";
    }

    @GetMapping("/login")
    public String login (@RequestParam(name = "error", required = false) Boolean error, Model model){
        if(Boolean.TRUE.equals(error)){
            model.addAttribute("error", true);
        }
        return "loginIn";
    }

}