package za.ac.cput.PizzaDeliveryFrontend.service;

import za.ac.cput.PizzaDeliveryFrontend.domain.Address;

import java.util.Set;

/*
AddressService.java
Author: Tamryn Lisa Lewin (219211981)
Date: 09 June 2023
Last updated: 10 June 2023
 */

public interface AddressService extends za.ac.cput.PizzaDeliveryFrontend.service.IService<Address, String> {
    Address create(Address address);
    Address read(String addressId);
    Address update(Address address);
    Set<Address> getAll();
}
