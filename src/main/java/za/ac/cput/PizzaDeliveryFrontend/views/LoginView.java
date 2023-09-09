package za.ac.cput.PizzaDeliveryFrontend.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("/login")
public class LoginView extends VerticalLayout {
    private Button g;
    public LoginView(){
    g = new Button("wda");

    add(g);
    }
}
