package za.ac.cput.PizzaDeliveryFrontend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import za.ac.cput.PizzaDeliveryFrontend.domain.Chef;
import za.ac.cput.PizzaDeliveryFrontend.domain.Employee;
import za.ac.cput.PizzaDeliveryFrontend.repository.IChefRepository;
//import za.ac.cput.PizzaDeliveryFrontend.service.ChefService;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/* ChefServiceImpl.java
 Author: Dawood Kamalie (220147760)
 Date: 11th June (last updated) 2023
*/


@Service
public class ChefServiceImpl {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String serverUrl = "http://localhost:8080/api"; // Replace with your server's URL
    public Set<Chef> getAllChefs() {
        String apiUrl = serverUrl + "/getAllChefs"; // Replace with your actual endpoint
        ResponseEntity<Chef[]> response = restTemplate.getForEntity(apiUrl, Chef[].class);

        if (response.getStatusCode().is2xxSuccessful()) {
            Chef[] chefs = response.getBody();
            return new HashSet<>(Arrays.asList(chefs));
        } else {
            // Handle the error or return an empty list
            return Collections.emptySet();
        }
    }
}



