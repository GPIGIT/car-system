package com.inventorycarsystem.carsystem.service.impl;

import com.inventorycarsystem.carsystem.model.Car;
import com.inventorycarsystem.carsystem.service.CarService;
import com.inventorycarsystem.repository.CarRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class CarServiceImpl implements CarService {
    // create repository layer
    private CarRepository carRepository;
    @Override
    public String getCar() {

        return "hello from service!";
    }

    @Override
    public String insertCar() {
//        carRepository.save(null);
        return "Hay from Service";
    }


}
