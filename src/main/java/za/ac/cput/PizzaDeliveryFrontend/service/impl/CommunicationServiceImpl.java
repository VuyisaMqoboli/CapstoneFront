package za.ac.cput.PizzaDeliveryFrontend.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class CommunicationServiceImpl {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String serverUrl = "http://localhost:8080/api"; // Replace with your server's URL


    public void checkConnectionAndPrintToConsole() {
        try {
            ResponseEntity<String> response = restTemplate.getForEntity(serverUrl + "/api/ping", String.class);
            if (response.getStatusCode().is2xxSuccessful()) {
                System.out.println("Connection made");
            } else {
                System.out.println("Connection failed");
            }
        } catch (Exception e) {
            System.out.println("Connection failed" + e.getMessage());
            System.out.println("Connection failed");
        }
    }

    public String print(){
        checkConnectionAndPrintToConsole();
        return null;
    }
}
