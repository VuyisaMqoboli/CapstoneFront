package za.ac.cput.PizzaDeliveryFrontend.service;

import za.ac.cput.PizzaDeliveryFrontend.domain.Driver;

import java.util.Set;

/*DriverService.java
Author: Azhar Allie Mohammed(217250513)
Date: 11/06/2023

 */
public interface DriverService extends za.ac.cput.PizzaDeliveryFrontend.service.IService<Driver, String> {
    Driver create(Driver driver);
    Driver read(String empId);
    Driver update(Driver driver);

    boolean delete(String empId);

    Set<Driver> getAll();

}

