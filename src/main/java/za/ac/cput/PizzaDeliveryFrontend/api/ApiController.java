package za.ac.cput.PizzaDeliveryFrontend.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import za.ac.cput.PizzaDeliveryFrontend.domain.Pizzeria;

/*
ApiController.java
Author: Timothy Lombard (220154856)
 Date: 1st September (last updated) 2023
 */
@RestController
public class ApiController {
    static RestTemplate restTemplate = new RestTemplate();
    @Autowired
    private RestTemplate restTemplate2;
    private static String urlPizzeria = "localhost:8080/pizzeria";

    @GetMapping("/api/ping")
    public String ping() {
        System.out.println("Received ping request");
        return "pong";
    }

    public Pizzeria readPizzeria(String id){
        Pizzeria p = restTemplate.getForObject(urlPizzeria + "/read/" + id, Pizzeria.class);
        System.out.println(p.toString());

    return p;
    }
}
