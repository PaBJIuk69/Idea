package com.example.flower.controller;

import com.example.flower.dao.FlowerDao;
import com.example.flower.model.Flower;
import com.example.flower.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FlowerController {
    @Autowired
    FlowerDao flowerDao;

    @Autowired
    public FlowerService flowerService;

    @GetMapping("/flower")
    public String getAllFlower(Model model){
        model.addAttribute("flowers",flowerDao.AllFlower());
        return "flower";
    }

    @GetMapping("/flowerList")
    public String getAllFlowerList(Model model){
        model.addAttribute("flowers",flowerDao.AllFlower());
        return "flowerList";
    }

    @GetMapping("/addFlower")
    public String createFlower(){
        return "createFlower";
    }

    @PostMapping ("/addFlower")
    public String addFlower (@ModelAttribute("flower") Flower flower){
        flowerService.save(flower);
        return "redirect:/flowerList";
    }

    @PostMapping ("/updateFlower")
    public String updateFlower (@ModelAttribute("flower") Flower flower){
        flowerService.update(flower);
        return "redirect:/flowerList";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model){
        model.addAttribute("flower",flowerService.getById(id));
        return "editFlower";
    }

    @GetMapping("/delete/{id}")
    public String deleteFlower(@PathVariable("id") int id){
        flowerService.delete(id);
        return "redirect:/flowerList";
    }

}
