package hello.example.designpattern.factory.factorymethod;

import hello.example.designpattern.factory.PizzaType;

public class DependentPizzaStore {

    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals(StoreType.SEOUL)) {
            if (type.equals(PizzaType.CHEESE)) {
                return new SeoulStyleCheesePizza();
            } else if (type.equals(PizzaType.HAWAIIAN)) {
                return new SeoulStyleHawaiianPizza();
            } else if (type.equals(PizzaType.PEPPERONI)) {
                return new SeoulStylePepperoniPizza();
            } else if (type.equals(PizzaType.VEGGIE)) {
                return new SeoulStyleVeggiePizza();
            }
        } else if (style.equals(StoreType.BUSAN)) {
            if (type.equals(PizzaType.CHEESE)) {
                return new BusanStyleCheesePizza();
            } else if (type.equals(PizzaType.HAWAIIAN)) {
                return new BusanStyleHawaiianPizza();
            } else if (type.equals(PizzaType.PEPPERONI)) {
                return new BusanStylePepperoniPizza();
            } else if (type.equals(PizzaType.VEGGIE)) {
                return new BusanStyleVeggiePizza();
            }
        } else {
            System.out.println("존재하지 않은 피자입니다. 확인 후 주문해주세요.");
            return null;
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
