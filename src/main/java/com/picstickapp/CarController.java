package com.picstickapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by David on 09/05/2015.
 */
@Controller
@PreAuthorize("hasRole('ROLE_ADMIN')")
public class CarController {

    @RequestMapping(value = "/postcar", method= RequestMethod.POST)
    public ResponseEntity<Car> sayHello(@RequestBody Car car) {
        if (car != null) {
            car.setMiles(car.getMiles() + 100);
        }

        return new ResponseEntity<Car>(car, HttpStatus.OK);
    }

    @RequestMapping(value = "/getcar", method = RequestMethod.GET)
    public ResponseEntity<Car> get() {

        Car car = new Car();
        car.setColor("Blue1!");
        car.setMiles(100);
        car.setVIN("1234");

        return new ResponseEntity<Car>(car, HttpStatus.OK);
    }
}
