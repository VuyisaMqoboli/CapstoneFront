package za.ac.cput.PizzaDeliveryFrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import za.ac.cput.PizzaDeliveryFrontend.api.ApiController;


@SpringBootApplication
public class PizzaDeliveryFrontendApplication {
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(PizzaDeliveryFrontendApplication.class, args);

		ApiController o = new ApiController();
		o.readPizzeria("2487d4fb-9ab9-4bf3-b975-de9838ca3be8");
	}

}
