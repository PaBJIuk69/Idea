package org.mycompany.myname.controller;

import org.mycompany.myname.entity.Flower;
import org.mycompany.myname.service.FlowerService;
import org.mycompany.myname.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class MainController {
    @Autowired
    public FlowerService flowerService;




    @GetMapping("/flower")
    public String getAllFlower(Model model){
        model.addAttribute("flowers",flowerService.findAllFlower());
        return "flower";
    }

    @GetMapping("/flowerShop")
    public String getAllFlowerUser(Model model){
        model.addAttribute("flowers",flowerService.findAllFlower());
        return "flowerShop";
    }

    @GetMapping("/addFlower")
    public String createFlower(){
        return "createFlower";
    }

    @PostMapping ("/addFlower")
    public String addFlower (@ModelAttribute("flower") Flower flower){
        flowerService.save(flower);
        return "redirect:/flower";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model){
        model.addAttribute("flower",flowerService.getById(id));
        return "editFlower";
    }

    @PostMapping ("/updateFlower")
    public String updateFlower (@ModelAttribute("flower") Flower flower){
        flowerService.update(flower);
        return "redirect:/flower";
    }

    @GetMapping("/delete/{id}")
    public String deleteFlower(@PathVariable("id") int id){
        flowerService.delete(id);
        return "redirect:/flower";
    }



}
