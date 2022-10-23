package hello.example.designpattern.factory.simplefactoryextend;

public class SeoulStyleHawaiianPizza extends Pizza {
    public SeoulStyleHawaiianPizza() {
        name = "Seoul Style Hawaiian Pizza";
        dough = "Thin Crust";
        sauce = "Marinara Sauce";
        toppings.add("Pineapple");
        toppings.add("Pepperoni");
        toppings.add("Italian Sausage");
    }
}
