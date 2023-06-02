package com.ecom.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.backend.models.Product;
import com.ecom.backend.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getProductsByType(String type) {
        return productRepo.findAllByType(type);
    }

    @Override
    public Product getProduct(String id) {
        return productRepo.findById(id).get();
    }

    @Override
    public List<Product> getProducts() {
        return productRepo.findAll();
    }
}
