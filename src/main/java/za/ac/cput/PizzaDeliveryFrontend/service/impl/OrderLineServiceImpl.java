package za.ac.cput.PizzaDeliveryFrontend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.PizzaDeliveryFrontend.domain.OrderLine;
import za.ac.cput.PizzaDeliveryFrontend.repository.OrderLineRepository;
import za.ac.cput.PizzaDeliveryFrontend.service.OrderLineService;

import java.util.ArrayList;

/*
OrderLineServiceImpl.java
Author: Tamryn Lisa Lewin (219211981)
Date: 09 June 2023
Last updated: 24 July 2023
 */

@Service
public class OrderLineServiceImpl implements OrderLineService {
    private OrderLineRepository repository;

    @Autowired
    private OrderLineServiceImpl(OrderLineRepository repository) {
        this.repository = repository;
    }

    @Override
    public OrderLine create(OrderLine orderLine) {
        return this.repository.save(orderLine);
    }

    @Override
    public OrderLine read(String orderLineId) {
        return this.repository.findById(orderLineId).orElse(null);
    }

    @Override
    public OrderLine update(OrderLine orderLine) {
        if (this.repository.existsById(orderLine.getOrderLineId())) {
            return this.repository.save(orderLine);
        }
        return null;
    }

    @Override
    public boolean delete(String orderLineId) {
        if (this.repository.existsById(orderLineId)) {
            this.repository.deleteById(orderLineId);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<OrderLine> getAll() {
        return (ArrayList<OrderLine>) this.repository.findAll();
    }
}
