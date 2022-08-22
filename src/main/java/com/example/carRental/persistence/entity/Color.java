package com.example.carRental.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Table(name="colors")
@Setter
@Getter
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
