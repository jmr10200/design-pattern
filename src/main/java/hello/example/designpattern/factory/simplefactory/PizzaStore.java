package hello.example.designpattern.factory.simplefactory;

public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        // 어떤 피자 만들지 공장에서
        pizza = factory.createPizza(type);

        // 피자 조리
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
