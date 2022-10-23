package hello.example.designpattern.factory.simplefactory;

public class HawaiianPizza extends Pizza {
    public HawaiianPizza() {
        name = "Hawaiian Pizza";
        dough = "Thin Crust";
        sauce = "Marinara Sauce";
        toppings.add("Pineapple");
        toppings.add("Pepperoni");
        toppings.add("Italian Sausage");
    }
}
