package com.example.carRental.persistence.repository;

import com.example.carRental.persistence.entity.Car;
import com.example.carRental.service.dto.CarDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//CRUD  OPERASYONLAR HAZIR
public interface CarRepo extends JpaRepository<Car,Integer> {  //integer   primary key
    List<Car> getByBrandId(int id);
}
