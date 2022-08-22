package com.example.carRental.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="cars")
public class Car {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "brand_id")       // id ye göre brand tablosu  // db ye id koyar
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "color_id")     // id ye göre color tablosu
    private Color color;

    @Column(name="model_year")
    private int modelYear;

    @Column(name="daily_price")
    private int dailyPrice;

    @Column(name="description")
    private String description;

}

