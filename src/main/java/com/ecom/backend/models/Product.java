package com.ecom.backend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "products")
@Data
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private Integer amount;
    private Integer stock;
    private String img1;
    private String img2;
    private String img3;
    private String type;
}
