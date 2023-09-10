package za.ac.cput.PizzaDeliveryFrontend.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.component.orderedlayout.FlexComponent;

@Route("login")
@PageTitle("User Login")
public class LoginView extends Div {

    public LoginView() {
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.CENTER);
        verticalLayout.setSizeFull();


        H1 heading = new H1("User Login");


        VerticalLayout centerLayout = new VerticalLayout();
        centerLayout.setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.CENTER);

        EmailField emailField = new EmailField("Email");
        emailField.setPlaceholder("Enter your email");

        PasswordField passwordField = new PasswordField("Password");
        passwordField.setPlaceholder("Hint: Password");

        Button loginButton = new Button("Login");

        loginButton.addClickListener(event -> {
            String email = emailField.getValue();
            String password = passwordField.getValue();

            if (isValidEmail(email) && isValidPassword(password)) {
                if (password.equals("Password")) {
                    Notification.show("Login Successful!");
                } else {
                    Notification.show("Invalid password.");
                }
            } else {
                Notification.show("Invalid email.");
            }
        });

        centerLayout.add(emailField, passwordField, loginButton);
        verticalLayout.add(heading, centerLayout);
        add(verticalLayout);
    }

    private boolean isValidEmail(String email) {
        // Basic email validation using a regular expression
        return email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
    }

    private boolean isValidPassword(String password) {
        // Basic password validation (e.g., minimum length)
        // You should use more robust password policies and hashing in production
        return password.length() >= 6;
    }
}
