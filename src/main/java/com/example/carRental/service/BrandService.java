package com.example.carRental.service;

import com.example.carRental.persistence.entity.Brand;
import com.example.carRental.service.dto.BrandDto;

import java.util.List;

public interface BrandService {
    List<BrandDto> getAll();
    void save(Brand brand);
    BrandDto update(Brand  brand);
    void delete(Brand brand);
}


