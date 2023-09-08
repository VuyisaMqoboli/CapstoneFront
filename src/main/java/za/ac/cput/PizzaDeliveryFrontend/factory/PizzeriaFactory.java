package za.ac.cput.PizzaDeliveryFrontend.factory;

import za.ac.cput.PizzaDeliveryFrontend.domain.Pizzeria;
import za.ac.cput.PizzaDeliveryFrontend.util.Helper;

/* PizzeriaFactory.java
   Entity for the PizzeriaFactory
   Author: Keenan Meyer (220194920)
   Date: 30th March 2023
*/
public class PizzeriaFactory {
    public static Pizzeria buildRestaurant(String restaurantName,String location) {
        if (Helper.isNullOrEmpty(restaurantName)  || Helper.isNullOrEmpty(String.valueOf(location))) {
            return null;
        }

        String restaurantID = Helper.generateId();

        Pizzeria pizzeria = new Pizzeria.Builder().
                setRestaurantID(restaurantID).
                setRestaurantName(restaurantName)
                .setLocation(location)
                .build();
        return pizzeria;

    }
}
