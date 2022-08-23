package com.example.carRental;

import com.example.carRental.persistence.entity.Brand;
import com.example.carRental.persistence.entity.Car;
import com.example.carRental.persistence.entity.Color;
import com.example.carRental.persistence.repository.CarRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CarRentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRentalApplication.class, args);




	}

}
