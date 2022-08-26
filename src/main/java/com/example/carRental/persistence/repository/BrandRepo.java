package com.example.carRental.persistence.repository;

import com.example.carRental.persistence.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepo extends JpaRepository<Brand,Integer> {

    Brand findById(int id);
    Brand findByName(String name);
}
