package com.example.carRental.persistence.repository;

import com.example.carRental.persistence.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
//CRUD  OPERASYONLAR HAZIR
public interface carRepo extends JpaRepository<Car,Integer> {  //integer   primary key

}
