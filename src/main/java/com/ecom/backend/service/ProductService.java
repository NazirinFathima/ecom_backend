package com.ecom.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecom.backend.models.Product;

@Service
public interface ProductService {

    List<Product> getProductsByType(String type);

    Product getProduct(String id);

    List<Product> getProducts();

}
