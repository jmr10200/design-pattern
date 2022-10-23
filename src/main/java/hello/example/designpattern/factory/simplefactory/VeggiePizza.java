package hello.example.designpattern.factory.simplefactory;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "Veggie Pizza";
        dough = "Crust";
        sauce = "Marinara Sauce";
        toppings.add("Shredded Mozzarella");
        toppings.add("Sliced Mushrooms");
        toppings.add("Sliced Black Olives");
        toppings.add("Sliced Garlic");
        toppings.add("Grated parmesan");

    }
}
