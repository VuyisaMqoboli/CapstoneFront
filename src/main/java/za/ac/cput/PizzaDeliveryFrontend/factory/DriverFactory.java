package za.ac.cput.PizzaDeliveryFrontend.factory;
/*
DriverFactory.java
Author: Azhar Allie Mohammed (217250513)
Date: 04/04/2023
*/

import za.ac.cput.PizzaDeliveryFrontend.domain.Driver;
import za.ac.cput.PizzaDeliveryFrontend.domain.Pizzeria;
import za.ac.cput.PizzaDeliveryFrontend.domain.Vehicle;
import za.ac.cput.PizzaDeliveryFrontend.util.Helper;

public class DriverFactory {
    public static Driver createDriver(String name, String surname, String phoneNumber, String email, Vehicle vehicleId, Pizzeria pizzeria){
        if(Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(surname) || Helper.isNullOrEmpty(phoneNumber) || Helper.isNullOrEmpty(email) || Helper.isNullOrEmpty(String.valueOf(vehicleId)) || Helper.isNullOrEmpty(String.valueOf(pizzeria))){
            return null;
        }
        String empId = Helper.generateId();

      Driver driver = (Driver) new Driver.Builder().setVehicle(vehicleId).setEmpId(empId).setName(name).setSurname(surname).setPhoneNumber(phoneNumber).setEmail(email).setPizzeria(pizzeria).build();
      return driver;
    }

    }

