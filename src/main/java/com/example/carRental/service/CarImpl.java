package com.example.carRental.service;

import com.example.carRental.persistence.entity.Car;
import com.example.carRental.persistence.repository.CarRepo;
import com.example.carRental.service.dto.CarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarImpl implements CarService {
    @Autowired
    private CarRepo carrepo;

    public CarImpl(CarRepo carrepo) {

        this.carrepo = carrepo;
    }

    @Override
    public List<CarDto> getAll() {
        List<Car> carList = carrepo.findAll();
        List<CarDto>  carDtoList = new ArrayList<>();
        for(Car  car :carList){
            CarDto carDto = entityToDto(car);
            carDtoList.add(carDto);
        }
        return carDtoList;
    }

    @Override
    public void save(Car car) {
        carrepo.save(car);
    }

    @Override
    public CarDto update(Car car) {
        return entityToDto(carrepo.save(car));
    }

    @Override
    public void delete(Car car) {
        carrepo.delete(car);

    }

    private CarDto entityToDto(Car car) {
        CarDto cardto =  new CarDto();
        cardto.setDescription(car.getDescription());
        cardto.setModelYear(car.getModelYear());
        cardto.setDailyPrice(car.getDailyPrice());
        cardto.setBrandName(car.getBrand().getName());
        cardto.setColorName(car.getColor().getName());
        return cardto;
    }
}
