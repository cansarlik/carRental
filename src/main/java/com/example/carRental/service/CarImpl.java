package com.example.carRental.service;

import com.example.carRental.persistence.entity.Car;
import com.example.carRental.persistence.repository.BrandRepo;
import com.example.carRental.persistence.repository.CarRepo;
import com.example.carRental.persistence.repository.ColorRepo;
import com.example.carRental.service.dto.CarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarImpl implements CarService {
    @Autowired
    private CarRepo carrepo;
    @Autowired
    private ColorRepo colorrepo;
    @Autowired
    private BrandRepo brandrepo;

    public CarImpl(CarRepo carrepo, ColorRepo colorrepo, BrandRepo brandrepo) {
        this.carrepo = carrepo;
        this.colorrepo = colorrepo;
        this.brandrepo = brandrepo;
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
    public void save(CarDto cardto) {
        Car car = dtoToEntity(cardto);
        carrepo.save(car);
    }

    @Override
    public CarDto update(CarDto cardto) {
        Car car = dtoToEntity(cardto);
        return entityToDto(carrepo.save(car));
    }

    @Override
    public void delete(CarDto cardto) {
        Car car = dtoToEntity(cardto);
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
    private Car dtoToEntity(CarDto cardto) {
        Car car= new Car();
        car.setDescription(cardto.getDescription());
        car.setModelYear(cardto.getModelYear());
        car.setDailyPrice(cardto.getDailyPrice());
        car.setBrand(brandrepo.findByName(cardto.getBrandName()));
        car.setColor(colorrepo.findByName(cardto.getColorName()));
        return car;
    }
}
