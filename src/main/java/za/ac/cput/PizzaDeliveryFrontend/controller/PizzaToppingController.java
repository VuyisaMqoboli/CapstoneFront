package za.ac.cput.PizzaDeliveryFrontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.PizzaDeliveryFrontend.domain.Pizza;
import za.ac.cput.PizzaDeliveryFrontend.domain.PizzaTopping;
import za.ac.cput.PizzaDeliveryFrontend.domain.Topping;
import za.ac.cput.PizzaDeliveryFrontend.service.PizzaToppingService;
//import za.ac.cput.PizzaDeliveryFrontend.service.ToppingService;

import java.util.ArrayList;
import java.util.Set;
/* PizzaToppingController.java
 Author: Timothy Lombard (220154856)
 Date: 17th June (last updated) 2023
*/
@RestController
@RequestMapping("/pizzatopping")
public class PizzaToppingController {

    @Autowired
    private PizzaToppingService pizzaToppingService;

    @PostMapping("/create")
    public PizzaTopping create(@RequestBody PizzaTopping pizzaTopping){
        return pizzaToppingService.create(pizzaTopping);
    }

    @GetMapping("/read/{pizzaId}/{toppingId}")
    public ArrayList<PizzaTopping> read(@PathVariable Pizza pizzaId, Topping toppingId){
        return pizzaToppingService.readPizzaIdAndToppingId(pizzaId, toppingId);
    }

    @DeleteMapping("/delete/{pizzaId}/{toppingId}")
    public void delete(@PathVariable Pizza pizzaId, Topping toppingId){
         pizzaToppingService.deletePT(pizzaId, toppingId);
    }

    @GetMapping({"/getall"})
    public ArrayList<PizzaTopping> getAll(){
        return pizzaToppingService.getAll();
    }
}
