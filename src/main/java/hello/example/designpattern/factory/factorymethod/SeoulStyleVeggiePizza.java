package hello.example.designpattern.factory.factorymethod;

public class SeoulStyleVeggiePizza extends Pizza {
    public SeoulStyleVeggiePizza() {
        name = "Seoul Style Veggie Pizza";
        dough = "Crust";
        sauce = "Marinara Sauce";
        toppings.add("Shredded Mozzarella");
        toppings.add("Sliced Mushrooms");
        toppings.add("Sliced Black Olives");
        toppings.add("Sliced Garlic");
        toppings.add("Grated parmesan");

    }
}
