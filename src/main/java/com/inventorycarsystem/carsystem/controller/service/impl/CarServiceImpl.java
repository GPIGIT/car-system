package com.inventorycarsystem.carsystem.controller.service.impl;

import com.inventorycarsystem.carsystem.controller.service.CarService;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public String getCar() {
        return "hello from service!";
    }
}
