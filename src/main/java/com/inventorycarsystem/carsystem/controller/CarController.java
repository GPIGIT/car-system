package com.inventorycarsystem.carsystem.controller;

import com.inventorycarsystem.carsystem.model.Car;
import com.inventorycarsystem.carsystem.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
  // create service layer and try to call
    @Autowired
    private CarService carService;

    @GetMapping("/")
    public List<Car> getCar(){
        return  carService.getCars();
    }

    @PostMapping("/car")
    public Car insertCar(@RequestBody Car car) {  //@RequestBody handle with JSON format from Client request

       return carService.insertCar(car);
    }
}
