package hello.example.designpattern.factory.simplefactoryextend;

public class BusanStyleVeggiePizza extends Pizza {
    public BusanStyleVeggiePizza() {
        name = "Busan Style Veggie Pizza";
        dough = "Crust";
        sauce = "Marinara Sauce";
        toppings.add("Shredded Mozzarella");
        toppings.add("Diced Black Olives");
        toppings.add("Sliced Mushrooms");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan");

    }
}
