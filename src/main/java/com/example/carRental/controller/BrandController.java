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
    public void save(@RequestBody BrandDto branddto) {
        brandService.save(branddto);
    }
    //@PutMapping("/update")
   // private BrandDto update(@RequestBody BrandDto branddto) {
   //     return brandService.update(branddto);
    //}
    @DeleteMapping("/delete")
    private void delete(@RequestBody BrandDto branddto) {
        brandService.delete(branddto);
    }
}