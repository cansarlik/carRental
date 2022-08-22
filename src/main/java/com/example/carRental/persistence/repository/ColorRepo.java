package com.example.carRental.persistence.repository;

import com.example.carRental.persistence.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepo extends JpaRepository<Color,  Integer> {

    Color findById(int  id);
    Color findByName(String  name);
}
