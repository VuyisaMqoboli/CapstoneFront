package za.ac.cput.PizzaDeliveryFrontend.views;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Style;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.button.Button;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.PizzaDeliveryFrontend.domain.*;
import za.ac.cput.PizzaDeliveryFrontend.service.impl.*;
import java.util.Set;

/* AboutUsView.java
 Author: Timothy Lombard (220154856)
 Date: 9th September (last updated) 2023
*/

@Route("/about")
public class AboutUsView extends VerticalLayout {

    @Autowired
    private  EmployeeServiceImpl employeeService;

    @Autowired
    private ChefServiceImpl chefService;

    @Autowired
    private DriverServiceImpl driverService;

    @Autowired
    private VehicleServiceImpl vehicleService;

    private Html aboutUs;
    private Html value;
    private Html ingredients;
    private Html process;
    private Html closeOff;
    private Html meetTeam;
    private Html seeVehicle;

    private Button viewEmployee;
    private Button viewDriver;
    private Button viewChef;
    private Button viewVehicle;
    private Div employeeContainer;
    private Div chefContainer;
    private Div driverContainer;
    private Div vehicleContainer;

    public AboutUsView(){

        aboutUs = new Html("<div>ABOUT US</div>");
        value = new Html("<div><b>Our values:</b> Quality, freshness, and customer satisfaction are the cornerstones of our business. We believe that every pizza we create should be a masterpiece, made with the finest ingredients and served with a smile.</div>");
        ingredients = new Html("<div><b>Quality ingredients:</b> We source the freshest, locally-sourced ingredients to create our signature pizzas. Our commitment to quality means you can taste the difference in every bite.</div>");
        process = new Html("<div><b>Our process:</b> From hand-tossed dough to carefully selected toppings, every step in our pizza making process is a labour of love. We follow time-honored traditions to ensure each pizza is a culinary masterpiece.</div>");
        closeOff = new Html("<div>We invite you to explore our menu and experience the magic of our pizzeria. Place your order now and taste the difference for yourself!\n" +
                "\n" +
                "Thank you for choosing us. We can't wait to serve you a slice of happiness.</div>");
        meetTeam = new Html("<div>Meet our staff:</div>");

        viewEmployee = new Button("View Employees");
        viewChef = new Button("View Chefs");
        viewDriver = new Button("View drivers");

        seeVehicle = new Html("<div>View our vehicles:</div>");
        viewVehicle = new Button("View vehicles");

        employeeContainer = new Div();
        chefContainer = new Div();
        driverContainer = new Div();
        vehicleContainer = new Div();

        Style aboutUsStyle = aboutUs.getStyle();
        aboutUsStyle.set("font-family", "Arial");
        aboutUsStyle.set("font-size", "30px");
        aboutUsStyle.set("font-weight", "bold");

        Style valueStyle = value.getStyle();
        valueStyle.set("font-family", "Arial");
        valueStyle.set("font-size", "15px");

        Style ingredientsStyle = ingredients.getStyle();
        ingredientsStyle.set("font-family", "Arial");
        ingredientsStyle.set("font-size", "15px");

        Style processStyle = process.getStyle();
        processStyle.set("font-family", "Arial");
        processStyle.set("font-size", "15px");

        Style closeOffStyle = closeOff.getStyle();
        closeOffStyle.set("font-family", "Arial");
        closeOffStyle.set("font-size", "15px");

        Style meetStyle = meetTeam.getStyle();
        meetStyle.set("font-family", "Arial");
        meetStyle.set("font-size", "20px");
        meetStyle.set("font-weight", "bold");

        Style seeVehicleStyle = seeVehicle.getStyle();
        seeVehicleStyle.set("font-family", "Arial");
        seeVehicleStyle.set("font-size", "20px");
        seeVehicleStyle.set("font-weight", "bold");

        viewEmployee.addClickListener(event -> {
            try {
                Set<Employee> employees = employeeService.getAllEmployees();

                employeeContainer.removeAll();


                employees.forEach(employee -> {
                    employeeContainer.add(createEmployeeSpan(employee));
                });
            } catch (Exception e) {

                System.out.println("Failed to retrieve employees. Please try again later." + e.getMessage());
            }
        });

        viewChef.addClickListener(event -> {
            try {
                Set<Chef> chefs = chefService.getAllChefs();

                chefContainer.removeAll();


                chefs.forEach(chef -> {
                    chefContainer.add(createChefSpan(chef));
                });
            } catch (Exception e) {

                System.out.println("Failed to retrieve chefs. Please try again later." + e.getMessage());
            }
        });

        viewDriver.addClickListener(event -> {
            try {
                Set<Driver> drivers = driverService.getAllDrivers();

                driverContainer.removeAll();


                drivers.forEach(driver -> {
                    driverContainer.add(createDriverSpan(driver));
                });
            } catch (Exception e) {

                System.out.println("Failed to retrieve chefs. Please try again later." + e.getMessage());
            }
        });

        viewVehicle.addClickListener(event -> {
            try {
                Set<Vehicle> vehicles = vehicleService.getAllVehicles();

                vehicleContainer.removeAll();


                vehicles.forEach(vehicle -> {
                    vehicleContainer.add(createVehicleSpan(vehicle));
                });
            } catch (Exception e) {

                System.out.println("Failed to retrieve chefs. Please try again later." + e.getMessage());
            }
        });



        setMargin(true);

        add(aboutUs);
        add(value);
        add(ingredients);
        add(process);
        add(closeOff);
        add(meetTeam);
        add(viewEmployee);
        add(employeeContainer);
        add(viewChef);
        add(chefContainer);
        add(viewDriver);
        add(driverContainer);
        add(seeVehicle);
        add(viewVehicle);
        add(vehicleContainer);

    }

    private Span createEmployeeSpan(Employee employee) {
        return new Span(
                employee.getEmpId() + " - " +
                        employee.getName() + " - " +
                        employee.getSurname() + " - " +
                        employee.getPhoneNumber() + " - " +
                        employee.getEmail() + " - " +
                        employee.getPizzeria()
        );
    }

    private Span createChefSpan(Chef chef) {
        return new Span(
                chef.getEmpId() + " - " +
                        chef.getName() + " - " +
                        chef.getSurname() + " - " +
                        chef.getPhoneNumber() + " - " +
                        chef.getEmail() + " - " +
                        chef.getPizzeria() + " - " +
                        chef.getTitle() + " - " +
                        chef.getCulinaryExperience()
        );
    }

    private Span createDriverSpan(Driver driver) {
        return new Span(
                driver.getEmpId() + " - " +
                        driver.getName() + " - " +
                        driver.getSurname() + " - " +
                        driver.getPhoneNumber() + " - " +
                        driver.getEmail() + " - " +
                        driver.getPizzeria() + " - " +
                        driver.getVehicle()

        );
    }

    private Span createVehicleSpan(Vehicle vehicle) {
        return new Span(
                vehicle.getVehicleId() + " - " +
                        vehicle.getVehicleType() + " - " +
                        vehicle.getMake() + " - " +
                        vehicle.getModel() + " - " +
                        vehicle.getYear() + " - " +
                        vehicle.getColour()

        );
    }
}
