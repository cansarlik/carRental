package com.example.carRental;

import com.example.carRental.persistence.entity.Brand;
import com.example.carRental.persistence.entity.Car;
import com.example.carRental.persistence.entity.Color;
import com.example.carRental.persistence.repository.CarRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CarRentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRentalApplication.class, args);

		Brand brand = new Brand();
		brand.setId(1);
		brand.setName("mercedes");

		Color color= new Color();
		color.setId(1);
		color.setName("blue");

		Car car = new Car();
		car.setId(1);
		car.setColor(color);
		car.setBrand(brand);
		car.setDailyPrice(320);
		car.setDescription("bilgi");
		car.setModelYear(2012);
		System.out.println(car.getDescription());
		System.out.println(car.getColor().getName());






	}

}
