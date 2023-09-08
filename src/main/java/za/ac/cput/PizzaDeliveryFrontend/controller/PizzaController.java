package za.ac.cput.PizzaDeliveryFrontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.PizzaDeliveryFrontend.domain.Pizza;
import za.ac.cput.PizzaDeliveryFrontend.domain.Topping;
import za.ac.cput.PizzaDeliveryFrontend.service.PizzaService;
import za.ac.cput.PizzaDeliveryFrontend.service.ToppingService;

import java.util.ArrayList;
import java.util.Set;
/* PizzaController.java
 Author: Timothy Lombard (220154856)
 Date: 4th August (last updated) 2023
*/
@RestController
@RequestMapping("/pizza")
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @PostMapping("/create")
    public Pizza create(@RequestBody Pizza pizza){
        return pizzaService.create(pizza);
    }

    @GetMapping("/read/{id}")
    public Pizza read(@PathVariable String id){
        return pizzaService.read(id);
    }

    @PostMapping("/update")
    public Pizza update(@RequestBody Pizza pizza){
        return pizzaService.update(pizza);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){
        return pizzaService.delete(id);
    }

    @GetMapping({"/getall"})
    public ArrayList<Pizza> getAll(){
        return pizzaService.getAll();
    }
}
