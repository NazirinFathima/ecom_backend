package com.ecom.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.backend.models.Carousel;
import com.ecom.backend.repository.CarouselRepo;

@Service
public class HomepageServiceImpl implements HomepageService {
    @Autowired
    private CarouselRepo carouselRepo;

    @Override
    public List<Carousel> getAllCarousels(String type) {
        return carouselRepo.findAllByType(type);
    }
}