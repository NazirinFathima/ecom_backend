package com.ecom.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecom.backend.models.Carousel;

@Service
public interface HomepageService {

    List<Carousel> getAllCarousels(String type);
    
}
