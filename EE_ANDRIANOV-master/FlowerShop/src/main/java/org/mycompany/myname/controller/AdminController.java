package org.mycompany.myname.controller;


import org.mycompany.myname.entity.Item;
import org.mycompany.myname.entity.Order;
import org.mycompany.myname.entity.OrderDetail;
import org.mycompany.myname.service.OrderDetailService;
import org.mycompany.myname.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Controller
public class AdminController {

    @Autowired
    public OrderService orderService;

    @Autowired
    public OrderDetailService orderDetailService;

    @GetMapping("/cart/checkout")
    public String checkout (Model model){
       model.addAttribute("order",new Order());
        return "checkout";
    }

    @PostMapping("/saveOrder")
    public String saveOrder (@ModelAttribute @Valid Order order,  BindingResult result, HttpServletRequest request, HttpSession session){
        if (result.hasErrors()){
            return "checkout";
        }
        List<Item> cart = ( List<Item>)session.getAttribute("carts");
        order.setCreationDate(new Date());
        order.setCustomerAddress(request.getParameter("customerAddress"));
        order.setCustomerName(request.getParameter("customerName"));
        order.setPhone(request.getParameter("phone"));

        order.setName("New Order");
        orderService.saveOrder(order);
       List<Order> orders = orderService.findAllOrder();

        for (int i = 0; i <cart.size() ; i++) {
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setFlowerId(cart.get(i).getFlower().getId());
            orderDetail.setOrderId(orders.get(orders.size() - 1).getId());
            orderDetail.setPrice(cart.get(i).getFlower().getPrice());
            orderDetail.setNumber(cart.get(i).getNumber());
            orderDetailService.create(orderDetail);
        }
        session.removeAttribute("carts");

        return "thanks";
    }

    @GetMapping("/orders")
    public String adminPanel(Model model){
        model.addAttribute("orders", orderService.findAllOrder());
        return "orders";
    }

    @GetMapping("/orders/{id}")
    public String adminPanelId(@PathVariable ("id") int id, Model model){
        List<OrderDetail> orderDetailsList = orderDetailService.findAllOrder();
        List<OrderDetail> orderDetails = new ArrayList<>();

        for (OrderDetail x : orderDetailsList
             ) {
            if(x.getOrderId() == id)
                orderDetails.add(x);
        }
        model.addAttribute("orderdetails", orderDetails);
        model.addAttribute("orderId",orderDetails.get(0).getOrderId());
        return "orderdetail";
    }

}
