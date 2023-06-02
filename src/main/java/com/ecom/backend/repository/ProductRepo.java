package com.ecom.backend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecom.backend.models.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product, String> {

    List<Product> findAllByType(String type);

}
