package com.example.carRental.service;

import com.example.carRental.persistence.entity.Color;
import com.example.carRental.service.dto.ColorDto;

import java.util.List;

public interface ColorService {
    List<ColorDto> getAll();
    void save(ColorDto  colordto);
    ColorDto  update(ColorDto  colordto);
    void delete(ColorDto colordto);
}
