package za.ac.cput.PizzaDeliveryFrontend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.PizzaDeliveryFrontend.domain.Pizza;
import za.ac.cput.PizzaDeliveryFrontend.domain.PizzaTopping;
import za.ac.cput.PizzaDeliveryFrontend.domain.PizzaToppingId;
import za.ac.cput.PizzaDeliveryFrontend.domain.Topping;
import za.ac.cput.PizzaDeliveryFrontend.repository.IPizzaToppingRepository;
import za.ac.cput.PizzaDeliveryFrontend.service.PizzaToppingService;

import java.util.ArrayList;
import java.util.Set;
/* PizzaToppingServiceImpl.java
 Author: Timothy Lombard (220154856)
 Date: 21st July (last updated) 2023
*/
@Service
public class PizzaToppingServiceImpl implements PizzaToppingService {

    private IPizzaToppingRepository ptRepo;
    @Autowired
    private PizzaToppingServiceImpl(IPizzaToppingRepository ptRepo){
        this.ptRepo = ptRepo;
    }



    @Override
    public PizzaTopping create(PizzaTopping pt) {
        return this.ptRepo.save(pt);
    }

    @Override
    public PizzaTopping read(PizzaToppingId pizzaToppingId) {
        return null;
    }


    @Override
    public ArrayList<PizzaTopping> readPizzaIdAndToppingId(Pizza pizzaId, Topping toppingId){
        return ptRepo.findAllByPizzaIdAndToppingId(pizzaId, toppingId);
    }

    @Override
    public void deletePT(Pizza pizzaId, Topping toppingId){
        PizzaToppingId ptId = new PizzaToppingId(pizzaId, toppingId);
        ptRepo.deleteById(ptId);
    }




    @Override
    public ArrayList<PizzaTopping> getAll(){return (ArrayList<PizzaTopping>) this.ptRepo.findAll();}
}
