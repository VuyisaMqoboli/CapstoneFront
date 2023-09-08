package za.ac.cput.PizzaDeliveryFrontend.factory;

import za.ac.cput.PizzaDeliveryFrontend.domain.Customer;
import za.ac.cput.PizzaDeliveryFrontend.domain.Order;
import za.ac.cput.PizzaDeliveryFrontend.domain.Pizzeria;
import za.ac.cput.PizzaDeliveryFrontend.util.Helper;

import java.time.LocalDate;
import java.time.LocalTime;


/* OrderFactory.java
 Author: Timothy Lombard (220154856)
 Date: 30th July (last updated) 2023
*/

    public class OrderFactory {

        public static Order buildOrder(LocalDate createDate, LocalTime time, Customer customer, Order.OrderStatus orderStatus, Pizzeria pizzeria) {
            if (Helper.isNullOrEmpty(String.valueOf(Helper.isNullOrEmpty(String.valueOf(createDate)))) || Helper.isNullOrEmpty(String.valueOf(time))  || Helper.isNullOrEmpty(String.valueOf(customer)) || Helper.isNullOrEmpty(String.valueOf(orderStatus)) || Helper.isNullOrEmpty(String.valueOf(pizzeria)))  {
                return null;
            }

            String orderId = Helper.generateId();

            Order order = new Order.Builder().setOrderId(orderId).setCreateDate(createDate).setTime(time).setCustomer(customer).setOrderStatus(orderStatus).setPizzeria(pizzeria).build();
            return order;

        }

    }

