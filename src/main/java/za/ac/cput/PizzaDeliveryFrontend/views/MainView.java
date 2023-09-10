package za.ac.cput.PizzaDeliveryFrontend.views;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import za.ac.cput.PizzaDeliveryFrontend.domain.Employee;

@Route("/home") // map view to the root
class MainView extends VerticalLayout {
    //private EmployeeController employeeController;
    MainView() {
        var grid = new Grid<>(Employee.class);
        grid.setColumns("name", "surname", "email");
        //grid.setItems(employeeController.getall());
        add(grid);
    }
}
