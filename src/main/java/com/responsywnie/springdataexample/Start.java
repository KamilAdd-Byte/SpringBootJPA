package com.responsywnie.springdataexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private CarRepo carRepo;

    @Autowired
    public void setCarRepo(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    public void runExample() {
       Car car = new Car("Chevrolet","Aveo",Color.BLACK);
       carRepo.save(car);
    }
}
