package za.ac.cput.PizzaDeliveryFrontend.service;

import za.ac.cput.PizzaDeliveryFrontend.domain.Customer;
import java.util.Set;

/*
 * CustomerService.java
 * interface for the Customer Service
 * Author: Keenan Meyer - 220194920
 * Date: 09 June 2023
 */

public interface CustomerService extends za.ac.cput.PizzaDeliveryFrontend.service.IService<Customer, String> {
    //private CustomerRepository repository;
    Customer create(Customer customerID);

    Customer read(String customerID);

    Customer update(Customer customer);

    boolean delete(String customerID);
    Set<Customer> getAll();
}