package za.ac.cput.PizzaDeliveryFrontend.service;

import za.ac.cput.PizzaDeliveryFrontend.domain.OrderLine;

import java.util.ArrayList;

/*
OrderLineService.java
Author: Tamryn Lisa Lewin (219211981)
Date: 09 June 2023
Last updated: 10 June 2023
 */

public interface OrderLineService extends IService<OrderLine, String> {
    OrderLine create(OrderLine orderLine);
    OrderLine read(String orderLineId);
    OrderLine update(OrderLine orderLine);
    boolean delete(String orderLineId);
    ArrayList<OrderLine> getAll();
}
