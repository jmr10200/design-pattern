package hello.example.designpattern.factory.factorymethod;

public class BusanStylePepperoniPizza extends Pizza {
    public BusanStylePepperoniPizza() {
        name = "Busan Style Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced Double Pepperoni");
        toppings.add("Grated parmesan cheese");
    }

    @Override
    public void cut() {
        System.out.println("cutting.. square cut!");
    }
}
