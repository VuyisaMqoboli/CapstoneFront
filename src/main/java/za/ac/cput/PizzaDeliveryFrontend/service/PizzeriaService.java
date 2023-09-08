package za.ac.cput.PizzaDeliveryFrontend.service;

import java.util.Set;
import za.ac.cput.PizzaDeliveryFrontend.domain.Pizzeria;

/*
 * PizzeriaService.java
 * interface for the Pizzeria Service
 * Author: Keenan Meyer - 220194920
 * Date: 09 June 2023
 */

public interface PizzeriaService extends IService<Pizzeria, String> {
    Pizzeria create(Pizzeria pizzeria);
    Pizzeria read(String pizzeriaId);

    Set<Pizzeria> getAll();
}