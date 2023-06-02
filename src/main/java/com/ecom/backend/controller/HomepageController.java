package com.ecom.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.backend.models.Carousel;
import com.ecom.backend.models.Product;
import com.ecom.backend.service.HomepageService;
import com.ecom.backend.service.ProductService;

@CrossOrigin(origins = "*")
@RestController
public class HomepageController {
    @Autowired
    private HomepageService homepageService;
    @Autowired
    private ProductService productService;


    @GetMapping("/carousels/{type}")
    public List<Carousel> getAllCarousels(@PathVariable String type) {
        return homepageService.getAllCarousels(type);
    }
    @GetMapping("/products/{type}")
    public List<Product> getProductsByType(@PathVariable String type) {
        return productService.getProductsByType(type);
    }
}
