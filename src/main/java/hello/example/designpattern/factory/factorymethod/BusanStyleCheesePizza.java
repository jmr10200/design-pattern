package hello.example.designpattern.factory.factorymethod;

public class BusanStyleCheesePizza extends Pizza {
    public BusanStyleCheesePizza() {
        name = "Busan Style Cheese Pizza";
        dough = "Regular Crust";
        sauce = "White Garlic Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
