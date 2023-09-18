package za.ac.cput.PizzaDeliveryFrontend.domain;

import jakarta.persistence.*;

import java.util.Objects;

/* Pizza.java
 Entity for the Pizza
 Author: Timothy Lombard (220154856)
 Date: 21st July (last updated) 2023
*/
public class Pizza {

    public enum Size{
        EXTRA_SMALL, SMALL, MEDIUM, LARGE, EXTRA_LARGE
    }
    private String pizzaId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "baseId", referencedColumnName = "baseId")
    private Base baseId;
    private String name;
    private String description;
    private Size size;
    private boolean vegetarianOrNot;

    private double price;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pizzeriaID", referencedColumnName = "pizzeriaID")
    private za.ac.cput.PizzaDeliveryFrontend.domain.Pizzeria pizzeria;

    protected Pizza(){

    }

    private Pizza(Builder builder){
        this.pizzaId = builder.pizzaId;
        this.baseId = builder.baseId;
        this.name = builder.name;
        this.description = builder.description;
        this.size = builder.size;
        this.vegetarianOrNot = builder.vegetarianOrNot;
        this.price = builder.price;
        this.pizzeria = builder.pizzeria;
    }

    public String getPizzaId() {
            return pizzaId;
        }

    public Base getBaseId() {
        return baseId;
    }

    public String getName() {
            return name;
        }
    public String getDescription() {
            return description;
        }
    public Size getSize() {
            return size;
        }

    public boolean isVegetarianOrNot(){return vegetarianOrNot;}

    public double getPrice() {
            return price;
        }

    public Pizzeria getPizzeria() {
        return pizzeria;
    }

    public static class Builder {
        private String pizzaId;
        private Base baseId;
        private String name;
        private String description;
        private Size size;
        private boolean vegetarianOrNot;
        private double price;
        private Pizzeria pizzeria;

        public Builder setPizzaId(String pizzaId) {
            this.pizzaId = pizzaId;
            return this;
        }

        public Builder setBaseId(Base baseId) {
            this.baseId = baseId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description){
            this.description = description;
            return this;
        }

        public Builder setSize(Size size) {
            this.size = size;
            return this;
        }

        public Builder setVegetarianOrNot(boolean vegetarianOrNot) {
            this.vegetarianOrNot = vegetarianOrNot;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setPizzeria(Pizzeria pizzeria) {
            this.pizzeria = pizzeria;
            return this;
        }

        public Builder copy(za.ac.cput.PizzaDeliveryFrontend.domain.Pizza menu) {
            this.pizzaId = menu.pizzaId;
            this.baseId = menu.baseId;
            this.name = menu.name;
            this.description = menu.description;
            this.size = menu.size;
            this.vegetarianOrNot = menu.vegetarianOrNot;
            this.price = menu.price;
            this.pizzeria = menu.pizzeria;
            return this;
        }

        public za.ac.cput.PizzaDeliveryFrontend.domain.Pizza build() {
            return new za.ac.cput.PizzaDeliveryFrontend.domain.Pizza(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return vegetarianOrNot == pizza.vegetarianOrNot && Double.compare(pizza.price, price) == 0 && Objects.equals(pizzaId, pizza.pizzaId) && Objects.equals(baseId, pizza.baseId) && Objects.equals(name, pizza.name) && Objects.equals(description, pizza.description) && size == pizza.size && Objects.equals(pizzeria, pizza.pizzeria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pizzaId, baseId, name, description, size, vegetarianOrNot, price, pizzeria);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaId='" + pizzaId + '\'' +
                ", baseId=" + baseId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", size=" + size +
                ", vegetarianOrNot=" + vegetarianOrNot +
                ", price=" + price +
                ", pizzeria=" + pizzeria +
                '}';
    }
}
