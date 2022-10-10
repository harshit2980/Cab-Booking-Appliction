package com.cab.demo.controller;

import com.cab.demo.entity.Driver;
import com.cab.demo.location.Location;
import com.cab.demo.location.PersonJourney;
import com.cab.demo.sevices.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {
    @Autowired
    private CabService cabService;

    @GetMapping("/findCab/")
    ResponseEntity<Object> getCab(@RequestBody PersonJourney personJourney){
        List<Driver> drivers=cabService.findRide(personJourney.getName(),personJourney.getSource(),personJourney.getDestination());
        if(drivers.size()>0){
            return ResponseEntity.of(Optional.of(drivers));
        }
        else{
            return ResponseEntity.ok().body("No Ride Found");
        }
    }
}
