package za.ac.cput.PizzaDeliveryFrontend.views;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.PizzaDeliveryFrontend.service.impl.PizzaServiceImpl;

@Route("/menu")
public class MenuView extends VerticalLayout {
    @Autowired
    private PizzaServiceImpl pizzaService;
    H1 h1 = new H1("Menu");
    Div shell, item1, item2, item3, item4;

    Paragraph p = new Paragraph("Please select an item:");

    public MenuView(){
        shell = new Div(
            item1 = new Div(),
            item2 = new Div(),
            item3 = new Div(),
            item4 = new Div()
        );
        shell.addClassName("shell");
        item1.addClassName("item1");
        item2.addClassName("item2");
        item3.addClassName("item3");
        item4.addClassName("item4");


        add(h1, p, shell);

    }

}
