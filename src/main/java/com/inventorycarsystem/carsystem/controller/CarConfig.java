package com.inventorycarsystem.carsystem.controller;

import com.inventorycarsystem.carsystem.model.Car;
import com.inventorycarsystem.carsystem.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class CarConfig {

    @Bean
    CommandLineRunner commandLineRunner (CarRepository repository){
      return  args -> {
          Car peugeot = new Car();
          peugeot.setManufacture("Peugeot");
          peugeot.setModel("308");
          peugeot.setId(1);
          peugeot.setCreated(LocalDate.of(2010,06,26));

          Car toyota = new Car();
          toyota.setManufacture("Toyota");
          toyota.setModel("avensis");
          toyota.setId(2);
          toyota.setCreated(LocalDate.of(2008,05,02));

          repository.saveAll(
                  List.of(peugeot,toyota)
          );
      } ;
    };

}
