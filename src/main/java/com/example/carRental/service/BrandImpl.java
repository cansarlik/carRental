package com.example.carRental.service;

import com.example.carRental.persistence.entity.Brand;
import com.example.carRental.persistence.repository.BrandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandImpl implements BrandService{

    @Autowired
    private BrandRepo brandrepo;

    public void BrandServiceImpl(BrandRepo brandrepo){
        this.brandrepo  = brandrepo;
    }

    @Override
    public List<Brand>  getAll(){
        List<Brand>  brandList  = brandrepo.findAll();
        return  brandList;
    }
}
