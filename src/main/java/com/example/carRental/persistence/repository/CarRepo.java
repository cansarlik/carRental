package com.example.carRental.persistence.repository;

import com.example.carRental.persistence.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

//CRUD  OPERASYONLAR HAZIR
public interface CarRepo extends JpaRepository<Car,Integer> {  //integer   primary key
    //Car findById(int id);
    //Car findBy(String  );
    //List<Brand>  findByBrandId(int brandId)
    //List<C>

}
