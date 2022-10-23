package hello.example.designpattern.factory.simplefactoryextend;

public class BusanStyleHawaiianPizza extends Pizza {
    public BusanStyleHawaiianPizza() {
        name = "Busan Style Hawaiian Pizza";
        dough = "Thin Crust";
        sauce = "Marinara Sauce";
        toppings.add("Double Pineapple");
        toppings.add("Pepperoni");
    }
}
