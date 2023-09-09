package za.ac.cput.PizzaDeliveryFrontend.service.impl;
/* VehicleServiceImpl.java
Author: Azhar Allie Mohammed(217250513)
Date: 11/06/2023
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import za.ac.cput.PizzaDeliveryFrontend.domain.Driver;
import za.ac.cput.PizzaDeliveryFrontend.domain.Vehicle;
import za.ac.cput.PizzaDeliveryFrontend.repository.IVehicleRepository;
//import za.ac.cput.PizzaDeliveryFrontend.service.VehicleService;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class VehicleServiceImpl {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String serverUrl = "http://localhost:8080/api"; // Replace with your server's URL
    public Set<Vehicle> getAllVehicles() {
        String apiUrl = serverUrl + "/getAllVehicles"; // Replace with your actual endpoint
        ResponseEntity<Vehicle[]> response = restTemplate.getForEntity(apiUrl, Vehicle[].class);

        if (response.getStatusCode().is2xxSuccessful()) {
            Vehicle[] vehicles = response.getBody();
            return new HashSet<>(Arrays.asList(vehicles));
        } else {
            // Handle the error or return an empty list
            return Collections.emptySet();
        }
    }
}


