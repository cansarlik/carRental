package com.example.carRental.service;

import com.example.carRental.persistence.entity.Color;
import com.example.carRental.persistence.repository.ColorRepo;
import com.example.carRental.service.dto.ColorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ColorImpl implements ColorService {



    @Autowired
    private ColorRepo colorrepo;

    public ColorImpl(ColorRepo colorrepo) {
        this.colorrepo = colorrepo;
    }
    @Override
    public List<ColorDto> getAll() {
        List<Color> colorList = colorrepo.findAll();
        List<ColorDto> colorDtoList = new ArrayList<>();
        for (Color  color : colorList) {
            ColorDto colorDto = entityToDto(color);
            colorDtoList.add(colorDto);
        }
        return colorDtoList;
    }
    @Override
    public void save(ColorDto colordto) {
        Color color = dtoToEntity(colordto);
        colorrepo.save(color);
    }
    @Override
    public ColorDto update(ColorDto colordto){
        Color  color = dtoToEntity(colordto);
        return entityToDto(colorrepo.save(color));
    }
    @Override
    public void delete(ColorDto  colordto){
        Color color  =  dtoToEntity(colordto);
        colorrepo.delete(color);
    }
    private ColorDto  entityToDto(Color  color){
        ColorDto colordto =  new ColorDto();
        colordto.setName(color.getName());
        return colordto;
    }
    private Color  dtoToEntity(ColorDto  colordto){
        Color color =  new Color();
        color.setName(colordto.getName());
        return color;
    }
}