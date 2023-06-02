package com.ecom.backend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "orders")
@Data
public class Order {
    @Id
    private String id;
    private String name;
    private String email;
    private String address;
    private String product;
    private String pin;
    private String phone;
    private int quantity;
    private int price;
    private boolean status;
}
