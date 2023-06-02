package com.ecom.backend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecom.backend.models.Order;

@Repository
public interface OrderRepo extends MongoRepository<Order,String> {

    List<Order> findAllByEmail(String email);
    
}
