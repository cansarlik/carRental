package com.example.carRental.service.dto;

import com.example.carRental.persistence.entity.Car;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;
@Getter
@Setter
public class ColorDto {

    private int id;
    private String name;

}
