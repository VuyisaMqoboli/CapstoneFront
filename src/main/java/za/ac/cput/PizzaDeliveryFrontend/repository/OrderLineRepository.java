package za.ac.cput.PizzaDeliveryFrontend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.PizzaDeliveryFrontend.domain.OrderLine;

/*
OrderLineRepository.java
Author: Tamryn Lisa Lewin (219211981)
Date: 05 April 2023
 */

@Repository
public interface OrderLineRepository extends JpaRepository<OrderLine, String> {

}
