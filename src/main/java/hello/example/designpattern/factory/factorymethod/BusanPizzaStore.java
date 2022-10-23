package hello.example.designpattern.factory.factorymethod;

import hello.example.designpattern.factory.PizzaType;

/**
 * 부산 지점의 피자가게
 */
public class BusanPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals(PizzaType.CHEESE)) {
            return new BusanStyleCheesePizza();
        } else if (type.equals(PizzaType.HAWAIIAN)) {
            return new BusanStyleHawaiianPizza();
        } else if (type.equals(PizzaType.PEPPERONI)) {
            return new BusanStylePepperoniPizza();
        } else if (type.equals(PizzaType.VEGGIE)) {
            return new BusanStyleVeggiePizza();
        } else {
            return null;
        }
    }

}
