package com.inventorycarsystem.carsystem.model;

import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.Objects;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    // generate to prevent HIBERNATE insert same data
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(manufacture, car.manufacture) && Objects.equals(model, car.model) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacture, model);
    }
}
