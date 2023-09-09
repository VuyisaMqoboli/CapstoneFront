package za.ac.cput.PizzaDeliveryFrontend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import za.ac.cput.PizzaDeliveryFrontend.domain.Chef;
import za.ac.cput.PizzaDeliveryFrontend.domain.Driver;


import za.ac.cput.PizzaDeliveryFrontend.repository.IDriverRepository;
//import za.ac.cput.PizzaDeliveryFrontend.service.DriverService;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*
Author: Azhar Allie Mohammed(217250513)
Date: 11/06/2023
DriverServiceImpl.java
 */

@Service
public class DriverServiceImpl {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String serverUrl = "http://localhost:8080/api"; // Replace with your server's URL
    public Set<Driver> getAllDrivers() {
        String apiUrl = serverUrl + "/getAllDrivers"; // Replace with your actual endpoint
        ResponseEntity<Driver[]> response = restTemplate.getForEntity(apiUrl, Driver[].class);

        if (response.getStatusCode().is2xxSuccessful()) {
            Driver[] drivers = response.getBody();
            return new HashSet<>(Arrays.asList(drivers));
        } else {
            // Handle the error or return an empty list
            return Collections.emptySet();
        }
    }
}


