package com.example.carRental.service;

import com.example.carRental.persistence.entity.Car;
import com.example.carRental.service.dto.CarDto;

import java.util.List;

public interface CarService {
        List<CarDto> getAll();
        void save(Car car);
}
