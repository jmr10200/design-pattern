package hello.example.designpattern.factory.factorymethod;

public class SeoulStyleCheesePizza extends Pizza {
    public SeoulStyleCheesePizza() {
        name = "Seoul Style Cheese Pizza";
        dough = "Regular Crust";
        sauce = "White Garlic Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
        toppings.add("Honey");
    }
}
