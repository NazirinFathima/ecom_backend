package com.ecom.backend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecom.backend.models.Carousel;

@Repository
public interface CarouselRepo extends MongoRepository<Carousel, String> {

    List<Carousel> findAllByType(String type);

}
