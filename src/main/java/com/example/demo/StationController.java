package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class StationController {
    
    @GetMapping("/stations")
    public List<Station> getStations() {
        return List.of(
            new Station(1L, "Dublin Heuston"),
            new Station(2L, "Cork Kent"),
            new Station(3L, "Galway")
        );
    }
}
