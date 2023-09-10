package za.ac.cput.PizzaDeliveryFrontend.views;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Style;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

/*
HomeView.java
Author: Tamryn Lisa Lewin (219211981)
Last update: 10 September 2023
 */

@PageTitle("Home")
@Route("/home") // map view to the root
public class HomeView extends VerticalLayout {

//    private Image imgPizza;
    private RouterLink aboutLink, menuLink;
    private Button btnSignUp, btnLogin, btnOrderNow;
    private H1 welcomeHeading;
    private H4 whyChooseHead, getStartedHead;
    private Html htmlWelcome, htmlGetStarted, htmlEndMsg;
    private UnorderedList ulWhyChoose;
    private Div spacer;
    private HorizontalLayout hLLinks, hLMain;

    public HomeView() {

//        imgPizza = new Image("/images/pizza_wallpaper.png", "Pizza image");

        aboutLink = new RouterLink("About Us", AboutUsView.class);
        menuLink = new RouterLink("Menu", AboutUsView.class);

        btnSignUp = new Button("Sign Up");
        btnLogin = new Button("Login");
        btnOrderNow = new Button("Order Now");

        spacer = new Div();

        hLLinks = new HorizontalLayout();
        hLLinks.add(aboutLink, menuLink);

        hLMain = new HorizontalLayout();
        hLMain.add(hLLinks, spacer, btnLogin);
        hLMain.addAndExpand(btnLogin);
        hLMain.setVerticalComponentAlignment(FlexComponent.Alignment.END, btnLogin);

        welcomeHeading = new H1("Welcome to Hill Crest - Your Pizza Paradise!");

        htmlWelcome = new Html("<div><br>Craving delicious, piping-hot pizza delivered straight to your doorstep? <br>" +
                "Look no further! We're here to satisfy your pizza desires with a mouthwatering selection of " +
                "artisanal pizzas, made just the way you like them.<br><br></div>");

        whyChooseHead = new H4("Why Choose Hill Crest?");

        ulWhyChoose = new UnorderedList();
        ulWhyChoose.add(new Html("<li>Explore a tempting menu featuring a variety of flavors, from classic Margherita to daring BBQ Chicken.</li>"));
        ulWhyChoose.add(new Html("<li>Customize your pizza with a wide range of fresh toppings and crust options.</li>"));
        ulWhyChoose.add(new Html("<li>Lightning-fast delivery, so you can enjoy your favorite pizza without the wait.</li>"));
        ulWhyChoose.add(new Html("<li>Easy online ordering - it's as simple as a few taps on your device.</li>"));
        ulWhyChoose.add(new Html("<li>Exclusive <b>deals and discounts</b> for our <b>loyal customers</b>.</li>"));


        getStartedHead = new H4("Get Started Today!");
        htmlGetStarted = new Html("<div>Join the pizza revolution and experience the ultimate convenience of ordering pizza from the comfort of your home.<br> " +
                "Whether it's a solo pizza night or a family feast, we've got you covered.</div>");

        htmlEndMsg = new Html("<div><br>Your satisfaction is our top priority. We can't wait to serve you the pizza you love.<br><br>\n" +
                "\n" +
                "Hill Crest - Delivering Happiness, One Slice at a Time!<br></div>");


//      Button events
        btnSignUp.addClickListener(e -> {
            getUI().ifPresent(ui -> ui.navigate(AboutUsView.class));
        });

        btnLogin.addClickListener(e -> {
            getUI().ifPresent(ui -> ui.navigate(AboutUsView.class));
        });

        btnOrderNow.addClickListener(e -> {
            getUI().ifPresent(ui -> ui.navigate(AboutUsView.class));
        });



//      Styling elements
//        Style imgPizzaStyle = imgPizza.getStyle();
//        imgPizzaStyle.set("width", "100%");
//        imgPizzaStyle.set("height", "100%");
//        imgPizzaStyle.set("object-fit", "cover");

        Style spacerStyle = spacer.getStyle();
        spacerStyle.set("flex", "10");

        Style btnLoginStyle = btnLogin.getStyle();
        btnLoginStyle.set("margin-left", "auto");

        Style welcomeHeadingStyle = welcomeHeading.getStyle();
//        welcomeHeadingStyle.setTextAlign(Style.TextAlign.CENTER);
        welcomeHeadingStyle.set("color", "black");

        Style welcomeMessageStyle = htmlWelcome.getStyle();
        welcomeMessageStyle.set("font-size", "20px");
        welcomeMessageStyle.set("font-weight", "bold");
//        welcomeMessageStyle.set("text-align", "center");
        welcomeMessageStyle.set("color", "black");

        Style whyChooseHeadStyle = whyChooseHead.getStyle();
        whyChooseHeadStyle.set("color", "black");

        Style ulWhyChooseStyle = ulWhyChoose.getStyle();
        ulWhyChooseStyle.set("margin-top", "0");
        ulWhyChooseStyle.set("color", "black");


//      Add components to layout
//        add(imgPizza);
        add(hLMain);
        add(welcomeHeading);
        add(htmlWelcome);
        add(whyChooseHead);
        add(ulWhyChoose);
        add(getStartedHead);
        add(htmlGetStarted);
        add(btnSignUp);
        add(htmlEndMsg);
        add(btnOrderNow);
        setMargin(true);
    }
}
