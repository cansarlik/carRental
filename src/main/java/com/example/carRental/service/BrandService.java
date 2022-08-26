package com.example.carRental.service;

import com.example.carRental.persistence.entity.Brand;
import com.example.carRental.service.dto.BrandDto;

import java.util.List;

public interface BrandService {
    List<BrandDto> getAll();
    void save(BrandDto branddto);
    //BrandDto update(BrandDto  branddto);
    void delete(BrandDto branddto);
}


