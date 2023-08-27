package com.inventorycarsystem.carsystem.service;

import com.inventorycarsystem.carsystem.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getCars();
    public Car insertCar(Car car);
}
