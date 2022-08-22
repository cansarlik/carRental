package com.example.carRental.service.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CarDto {
    private String brandName;
    private String colorName;
    private int modelYear;
    private int dailyPrice;
    private String description;

}