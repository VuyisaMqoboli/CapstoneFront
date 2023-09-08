package za.ac.cput.PizzaDeliveryFrontend.factory;

import za.ac.cput.PizzaDeliveryFrontend.domain.Address;
import za.ac.cput.PizzaDeliveryFrontend.util.Helper;
import za.ac.cput.PizzaDeliveryFrontend.domain.LoyaltyCustomer;

import java.time.LocalDate;

/*
LoyaltyCustomerFactory.java
Author: Vuyisa Lutho Mqoboli (219191018)
Date: 04 April 2023
 */


public class LoyaltyCustomerFactory {
    public static LoyaltyCustomer createLoyaltyCustomer(String customerName, String customerSurname, String phoneNumber, Address address, LocalDate dateJoined, double discounts){
        if(Helper.isNullOrEmpty(customerName) || Helper.isNullOrEmpty(customerSurname) || Helper.isNullOrEmpty(phoneNumber) || Helper.isNullOrEmpty(String.valueOf(address)) || Helper.isNullOrEmpty(String.valueOf(dateJoined)) || Helper.isNullOrEmpty(String.valueOf(discounts))){
            return null;
        }

        String customerId = Helper.generateId();

       LoyaltyCustomer loyaltyCustomer = (LoyaltyCustomer) new LoyaltyCustomer.Builder().setDateJoined(dateJoined).setDiscounts(discounts).setCustomerID(customerId).setCustomerName(customerName).setCustomerSurname(customerSurname).setPhoneNumber(phoneNumber).setAddress(address).build();
       return loyaltyCustomer;
    }
}

