package com.ecom.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecom.backend.models.Order;

@Service
public interface OrderService {

    Order submitOrder(Order order);

    List<Order> getOrders(String email);
    
}
