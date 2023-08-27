package com.inventorycarsystem.carsystem.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "car_table")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "car_gen")
    @SequenceGenerator(name="car_gen",
            sequenceName="car_seq",
            allocationSize = 1)
    @Column(name = "car_id")
    private int id;
    @Column(name = "car_manufacture")
    private String manufacture;
    @Column(name = "car_model")
    private String model;
    @Column(name = "year_of_create")
        private LocalDate created;
}
