package hello.example.designpattern.factory.simplefactory;

public class CheesePizza extends Pizza {

    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "White Garlic Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
