package za.ac.cput.PizzaDeliveryFrontend.service;

import za.ac.cput.PizzaDeliveryFrontend.domain.Pizza;
import za.ac.cput.PizzaDeliveryFrontend.domain.PizzaTopping;
import za.ac.cput.PizzaDeliveryFrontend.domain.PizzaToppingId;
import za.ac.cput.PizzaDeliveryFrontend.domain.Topping;

import java.util.ArrayList;
import java.util.Set;
/* PizzaToppingService.java
 Author: Timothy Lombard (220154856)
 Date: 21st July (last updated) 2023
*/
public interface PizzaToppingService extends IService<PizzaTopping, PizzaToppingId> {

    PizzaTopping create(PizzaTopping pt);
    ArrayList<PizzaTopping> readPizzaIdAndToppingId(Pizza pizzaId, Topping toppingId);
    void deletePT(Pizza pizzaId, Topping toppingId);
  //  boolean delete(PizzaToppingId ptId);

    public ArrayList<PizzaTopping> getAll();
}
