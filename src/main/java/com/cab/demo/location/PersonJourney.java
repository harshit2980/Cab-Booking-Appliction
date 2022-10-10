package com.cab.demo.location;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonJourney {

    private String name;
    private Location source;
    private Location destination;

}
