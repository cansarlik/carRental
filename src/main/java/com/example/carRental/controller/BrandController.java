package com.example.carRental.controller;

import com.example.carRental.persistence.entity.Brand;
import com.example.carRental.service.BrandService;
import com.example.carRental.service.dto.BrandDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brandController")
public class BrandController {
    @Autowired
    private BrandService brandService;
    public BrandController(BrandService brandService){
        this.brandService = brandService;
    }

    @GetMapping("/getAll")
    public List<BrandDto> getAll(){
        return brandService.getAll();
    }
    @PostMapping("/save")
    public void save(@RequestBody Brand brand) {
        brandService.save(brand);
    }

    @PutMapping("/update")
    private BrandDto update(@RequestBody Brand brand) {
        return brandService.update(brand);
    }

    @DeleteMapping("/delete")
    private void delete(@RequestBody Brand brand) {
        brandService.delete(brand);
    }
}