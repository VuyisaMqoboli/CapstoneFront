package za.ac.cput.PizzaDeliveryFrontend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.PizzaDeliveryFrontend.domain.Address;
import za.ac.cput.PizzaDeliveryFrontend.domain.Customer;
import za.ac.cput.PizzaDeliveryFrontend.domain.CustomerAddress;
import za.ac.cput.PizzaDeliveryFrontend.domain.CustomerAddressId;
import za.ac.cput.PizzaDeliveryFrontend.repository.CustomerAddressRepository;
import za.ac.cput.PizzaDeliveryFrontend.service.CustomerAddressService;

import java.util.ArrayList;

@Service
public class CustomerAddressServiceImpl implements CustomerAddressService {

    private CustomerAddressRepository repository;

    @Autowired
    public CustomerAddressServiceImpl(CustomerAddressRepository repository) {
        this.repository = repository;
    }

    @Override
    public CustomerAddress create(CustomerAddress customerAddress) {
        return this.repository.save(customerAddress);
    }

    @Override
    public CustomerAddress read(CustomerAddressId customerAddressId) {
        return null;
    }

    @Override
    public ArrayList<CustomerAddress> readCustomerIDAndAddressId(Customer customerID, Address addressId) {
        return repository.findAllByCustomerIDAndAddressId(customerID, addressId);
    }

    @Override
    public ArrayList<CustomerAddress> getAll() {
        return (ArrayList<CustomerAddress>) this.repository.findAll();
    }
}
