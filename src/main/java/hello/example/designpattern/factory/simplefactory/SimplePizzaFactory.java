package hello.example.designpattern.factory.simplefactory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals(PizzaType.CHEESE)) {
            pizza = new CheesePizza();
        } else if (type.equals(PizzaType.HAWAIIAN)) {
            pizza = new HawaiianPizza();
        } else if (type.equals(PizzaType.PEPPERONI)) {
            pizza = new PepperoniPizza();
        } else if (type.equals(PizzaType.VEGGIE)) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
