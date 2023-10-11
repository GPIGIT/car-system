package com.inventorycarsystem.carsystem.controller;
//USE THIS CONTROLLER TO MANAGE with JSON REQUEST from Client

import com.inventorycarsystem.carsystem.model.Car;
import com.inventorycarsystem.carsystem.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    private CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/get/cars")
    public List<Car> getAllCars(){
       return  carService.getCars();
    }



    @PostMapping("/cars")
    public Car insertCar(@RequestBody Car car){
        carService.insertCar(car);
        return car;
    }

    @PutMapping("/cars/{carId}")
    public Car updateCar(@RequestBody Car car, @PathVariable Integer carId ){
        Car newData = car;
        if(car != null) {
           car =  carService.searchById(carId);
           if(car != null) {
               car = carService.updateCar(newData);
           }
        }
          return   car;
    }


    @PatchMapping(path = "/cars/{carId}")   // URL = http://localhost:8080/cars/1?manufacture=Mazzaraty
    public Car updatePartialCar(@PathVariable(name = "carId") Integer id,
                                @RequestParam(required = false) String manufacture,
                                @RequestParam(required = false)String model) {

          Car searchCar =  carService.searchById(id);
            if (searchCar != null) {

              return   carService.updateCar(id, manufacture, model);
            }

        return searchCar;
    }
}
