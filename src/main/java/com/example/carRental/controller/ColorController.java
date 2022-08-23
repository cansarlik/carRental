package com.example.carRental.controller;

import com.example.carRental.persistence.entity.Car;
import com.example.carRental.persistence.entity.Color;
import com.example.carRental.service.ColorService;
import com.example.carRental.service.dto.CarDto;
import com.example.carRental.service.dto.ColorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/colorController")
public class ColorController {
    @Autowired
    private ColorService colorService;

    public ColorController(ColorService colorService) {
        this.colorService = colorService;
    }

    @GetMapping("/getAll")
    public List<ColorDto> getAll() {

        return colorService.getAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Color color) {
        colorService.save(color);
    }

    @PutMapping("/update")
    private ColorDto update(@RequestBody Color color) {
        return colorService.update(color);
    }

    @DeleteMapping("/delete")
    private void delete(@RequestBody Color color) {
        colorService.delete(color);
    }
}