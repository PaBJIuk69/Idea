package org.mycompany.myname.controller;
import org.mycompany.myname.entity.Item;
import org.mycompany.myname.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CartController {

    @Autowired
    private FlowerService flowerService;

    @GetMapping ("/cart")
    public String cart (){
        return "cart";
    }

    @GetMapping("/buy/{id}")
    public String cartShop(@PathVariable("id") int id, HttpSession session){
        if(session.getAttribute("carts") == null){
            List<Item> cart = new ArrayList<>();
            cart.add(new Item(1,flowerService.getById(id)));
            session.setAttribute("carts",cart);
        }else{
            List<Item> cart = ( List<Item>)session.getAttribute("carts");
            int index = isExisting(id,session);
            if(index == -1)
                cart.add(new Item(1,flowerService.getById(id)));
            else{
                int number = cart.get(index).getNumber() + 1;
                cart.get(index).setNumber(number);
            }
        }
        return "redirect:/flowerShop";
    }

    @GetMapping("/cart/delete/{id}")
    public String cartDelete(@PathVariable("id") int id, HttpSession session){
        List<Item> cart = ( List<Item>)session.getAttribute("carts");
        int index = isExisting(id,session);
        cart.remove(index);
        session.setAttribute("carts",cart);
        return "cart";
    }



    @GetMapping("/flowerShop")
    public String getAllFlowerUser(Model model){
        model.addAttribute("flowers",flowerService.findAllFlower());
        return "flowerShop";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update (HttpServletRequest request, HttpSession session){
        List<Item> cart = ( List<Item>)session.getAttribute("carts");
        String [] number = request.getParameterValues("number");
        for (int i = 0; i <cart.size() ; i++) {
            cart.get(i).setNumber(Integer.parseInt(number[i]));
        }
        session.setAttribute("cart",cart);
        return "cart";
    }

    private int isExisting(int id,HttpSession session){
        List<Item> cart = ( List<Item>)session.getAttribute("carts");
        for (int i = 0; i <cart.size() ; i++)
            if (cart.get(i).getFlower().getId()==id)
                return i;
        return -1;
    }

}
