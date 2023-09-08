package za.ac.cput.PizzaDeliveryFrontend.service;

import za.ac.cput.PizzaDeliveryFrontend.domain.Base;

import java.util.ArrayList;
/* BaseService.java
 Author: Timothy Lombard (220154856)
 Date: 13th June (last updated) 2023
*/
public interface BaseService extends za.ac.cput.PizzaDeliveryFrontend.service.IService<Base, String> {

    Base update(Base base);
    boolean delete(String baseId);
    public ArrayList<Base> getAll();
}
