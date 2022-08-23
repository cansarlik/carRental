package com.example.carRental.service;

import com.example.carRental.persistence.entity.Brand;
import com.example.carRental.persistence.repository.BrandRepo;
import com.example.carRental.service.dto.BrandDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandImpl implements BrandService{

    @Autowired
    private BrandRepo brandrepo;
    public BrandImpl(BrandRepo brandrepo) {
        this.brandrepo = brandrepo;
    }

    @Override
    public List<BrandDto> getAll(){
        List<Brand> brandList = brandrepo.findAll();
        List<BrandDto> brandDtoList = new ArrayList<>();
        for (Brand  brand : brandList) {
            BrandDto brandDto = entityToDto(brand);
            brandDtoList.add(brandDto);
        }
        return brandDtoList;
    }
    @Override
    public void save(Brand brand) {

        brandrepo.save(brand);
    }
    @Override
    public BrandDto update(Brand brand){
        return entityToDto(brandrepo.save(brand));
    }
    @Override
    public void delete(Brand  brand){
        brandrepo.delete(brand);
    }
    private BrandDto  entityToDto(Brand  brand){
        BrandDto branddto =  new BrandDto();
        branddto.setName(brand.getName());
        branddto.setId(brand.getId());
        return branddto;
    }
}
