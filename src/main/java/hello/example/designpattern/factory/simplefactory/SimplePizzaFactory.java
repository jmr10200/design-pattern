package hello.example.designpattern.factory.simplefactory;

import hello.example.designpattern.factory.PizzaType;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        // 이런 방식으로 객체를 생성하는 방법으로 객체생성을 캡슐화한다.
        // 결합도를 낮추는 방식이다.
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
