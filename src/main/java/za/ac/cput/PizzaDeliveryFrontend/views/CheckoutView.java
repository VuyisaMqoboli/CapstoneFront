package za.ac.cput.PizzaDeliveryFrontend.views;

import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@Route("/checkout")
public class CheckoutView extends VerticalLayout {

    private Grid<Product> grid = new Grid<>(Product.class);
    private TextField quantityField = new TextField("Quantity");
    private Button addToCartButton = new Button("Add to Cart");
    private Button checkoutButton = new Button("Checkout");

    public CheckoutView() {
        // Set up the grid to display products
        grid.setColumns("name", "price");
        grid.setItems(new Product("Peperoni ", 130.00), new Product("Creamy Chicken ", 150.00));

        // Add components to the layout
        add(grid, quantityField, addToCartButton, checkoutButton);

        // Define button click actions
        addToCartButton.addClickListener(event -> addToCart());
        checkoutButton.addClickListener(event -> checkout());
    }

    private void addToCart() {
        // Implement logic to add the selected product to the shopping cart
    }

    private void checkout() {
        // Implement logic to process the checkout, calculate the total bill, and complete the sale.
    }

    public class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
}
