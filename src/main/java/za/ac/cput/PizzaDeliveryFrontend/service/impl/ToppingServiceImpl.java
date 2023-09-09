package za.ac.cput.PizzaDeliveryFrontend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import za.ac.cput.PizzaDeliveryFrontend.domain.Topping;
import za.ac.cput.PizzaDeliveryFrontend.repository.IToppingRepository;
//import za.ac.cput.PizzaDeliveryFrontend.service.ToppingService;

import java.util.ArrayList;
import java.util.Arrays;

/* ToppingServiceImpl.java
 Author: Timothy Lombard (220154856)
 Date: 21st July (last updated) 2023
*/
@Service
public class ToppingServiceImpl  {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String serverUrl = "http://localhost:8080/api"; // Replace with your server's URL



    public ArrayList<Topping> getAllToppings() {
        String apiUrl = serverUrl + "/getAllToppings"; // Replace with your actual endpoint
        ResponseEntity<Topping[]> response = restTemplate.getForEntity(apiUrl, Topping[].class);

        if (response.getStatusCode().is2xxSuccessful()) {
            Topping[] toppings = response.getBody();
            return new ArrayList<>(Arrays.asList(toppings));
        } else {
            // Handle the error or return an empty list
            return new ArrayList<>();
        }
    }


}
