package com.inventorycarsystem.carsystem.service.impl;

import com.inventorycarsystem.carsystem.model.Car;
import com.inventorycarsystem.carsystem.service.CarService;
import com.inventorycarsystem.carsystem.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
       private CarRepository carRepository;  // DB access layer


    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @Override
    public Car insertCar(Car car) {
        if(car != null) {
            return carRepository.save(car);
        }
        return car;
    }


}
