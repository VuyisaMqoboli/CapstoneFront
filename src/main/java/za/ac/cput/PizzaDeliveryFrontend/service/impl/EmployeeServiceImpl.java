package za.ac.cput.PizzaDeliveryFrontend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import za.ac.cput.PizzaDeliveryFrontend.domain.Employee;
import za.ac.cput.PizzaDeliveryFrontend.domain.Topping;
import za.ac.cput.PizzaDeliveryFrontend.repository.IEmployeeRepository;
//import za.ac.cput.PizzaDeliveryFrontend.service.EmployeeService;

import java.util.*;
import java.util.stream.Collectors;

/* EmployeeServiceImpl.java
 Author: Dawood Kamalie (220147760)
 Date: 11th June (last updated) 2023
*/
@Service
public class EmployeeServiceImpl {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String serverUrl = "http://localhost:8080/api"; // Replace with your server's URL



    public Set<Employee> getAllEmployees() {
        String apiUrl = serverUrl + "/getAllEmployees"; // Replace with your actual endpoint
        ResponseEntity<Employee[]> response = restTemplate.getForEntity(apiUrl, Employee[].class);

        if (response.getStatusCode().is2xxSuccessful()) {
            Employee[] employees = response.getBody();
            return new HashSet<>(Arrays.asList(employees));
        } else {
            // Handle the error or return an empty list
            return Collections.emptySet();
        }
    }


}
