package za.ac.cput.PizzaDeliveryFrontend.service;

import za.ac.cput.PizzaDeliveryFrontend.domain.*;

import java.util.ArrayList;

public interface CustomerAddressService extends za.ac.cput.PizzaDeliveryFrontend.service.IService<CustomerAddress, CustomerAddressId> {

    CustomerAddress create(CustomerAddress customerAddress);
    ArrayList<CustomerAddress> readCustomerIDAndAddressId(Customer customerID, Address addressId);
    ArrayList<CustomerAddress> getAll();
}
