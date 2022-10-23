package hello.example.designpattern.factory.factorymethod;

import hello.example.designpattern.factory.PizzaType;

/**
 * 서울 지점의 피자가게
 */
public class SeoulPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals(PizzaType.CHEESE)) {
            return new SeoulStyleCheesePizza();
        } else if (type.equals(PizzaType.HAWAIIAN)) {
            return new SeoulStyleHawaiianPizza();
        } else if (type.equals(PizzaType.PEPPERONI)) {
            return new SeoulStylePepperoniPizza();
        } else if (type.equals(PizzaType.VEGGIE)) {
            return new SeoulStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
