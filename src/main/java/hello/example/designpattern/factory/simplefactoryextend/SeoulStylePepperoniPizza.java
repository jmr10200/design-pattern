package hello.example.designpattern.factory.simplefactoryextend;

public class SeoulStylePepperoniPizza extends Pizza {
    public SeoulStylePepperoniPizza() {
        name = "Seoul Style Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    }
}
