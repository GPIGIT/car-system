package com.inventorycarsystem.repository;

import com.inventorycarsystem.carsystem.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car,Integer> {
}
