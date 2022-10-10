package com.cab.demo.entity;


import com.cab.demo.location.Location;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Driver {

    private String name;
    private Character gender;
    private Integer age;
    private String vehicle;
    private Location location;


}
