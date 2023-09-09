package za.ac.cput.PizzaDeliveryFrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import za.ac.cput.PizzaDeliveryFrontend.service.impl.CommunicationServiceImpl;

@SpringBootApplication
public class PizzaDeliveryFrontendApplication {
	public static CommunicationServiceImpl cs = new CommunicationServiceImpl();
	public static void main(String[] args) {
		SpringApplication.run(PizzaDeliveryFrontendApplication.class, args);

		System.out.println(cs.print());


	}

}
