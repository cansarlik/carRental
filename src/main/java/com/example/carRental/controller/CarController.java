package com.example.carRental.controller;

import com.example.carRental.persistence.entity.Car;
import com.example.carRental.service.CarService;
import com.example.carRental.service.dto.CarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CarController")
public class CarController {
    @Autowired
    private CarService carService;

    public CarController(CarService carService) {

        this.carService = carService;
    }

    @GetMapping("/getAll")
    private List<CarDto> getAll(){
        return carService.getAll();
    }

    @PostMapping("/save")
    private void save(@RequestBody CarDto cardto){
        carService.save(cardto);
    }

    @PutMapping("/update")
    private CarDto update(@RequestBody CarDto cardto){
        return carService.update(cardto);
    }

    @DeleteMapping("/delete")
    private void delete(@RequestBody CarDto cardto){
        carService.delete(cardto);
    }


}
