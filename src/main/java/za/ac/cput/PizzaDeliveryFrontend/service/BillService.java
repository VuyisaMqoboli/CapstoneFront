package za.ac.cput.PizzaDeliveryFrontend.service;

import za.ac.cput.PizzaDeliveryFrontend.domain.Bill;

import java.util.Set;

/*
BillService.java
Author: Vuyisa Lutho Mqoboli (219191018)
Date: 09 June 2023
Last updated: 11 June 2023
 */

public interface BillService extends za.ac.cput.PizzaDeliveryFrontend.service.IService<Bill, String> {
    Bill create(Bill bill);

    Bill read(String billId);

    Bill update(Bill bill);

    boolean delete(String billId);

    Set<Bill> getAll();
}

