package com.ecom.backend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("carousels")
public class Carousel {
    @Id
    private String id;
    private String src;
    private String type;
}
