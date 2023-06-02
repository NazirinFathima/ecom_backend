package com.ecom.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.backend.models.Order;
import com.ecom.backend.service.OrderService;

@CrossOrigin(origins = "*")
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/submitOrder")
    public Order submitOrder(@RequestBody Order order) {
        return orderService.submitOrder(order);
    }

    @GetMapping("/order/{email}")
    public List<Order> getOrders(@PathVariable String email) {
        return orderService.getOrders(email);
    }
}
