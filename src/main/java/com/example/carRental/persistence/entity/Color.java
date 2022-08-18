package com.example.carRental.persistence.entity;

import javax.persistence.*;
import java.util.List;
@Table(name="colors")
@Entity
public class Color {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "color")
    List<Car> cars;
}
