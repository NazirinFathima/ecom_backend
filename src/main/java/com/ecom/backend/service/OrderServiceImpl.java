package com.ecom.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.backend.models.Order;
import com.ecom.backend.models.Product;
import com.ecom.backend.repository.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ProductService productService;
    @Autowired
    private OrderRepo orderRepo;

    @Override
    public Order submitOrder(Order order) {
        String productId = order.getProduct();
        Integer orderQuantity = order.getQuantity();
        Product product = productService.getProduct(productId);
        Integer price = product.getAmount();
        order.setPrice(orderQuantity * price);
        return orderRepo.save(order);
    }

    @Override
    public List<Order> getOrders(String email) {
        return orderRepo.findAllByEmail(email);
    }

}
