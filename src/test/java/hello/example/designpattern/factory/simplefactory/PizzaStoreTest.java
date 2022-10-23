package hello.example.designpattern.factory.simplefactory;

import org.junit.jupiter.api.Test;

class PizzaStoreTest {

    @Test
    void simplePizza() {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);

        Pizza pizza = pizzaStore.orderPizza(PizzaType.HAWAIIAN);
        System.out.println(pizza.getName() + " 를 주문합니다.");
        System.out.println(pizza.toString());

        pizza = pizzaStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println(pizza.getName() + " 를 주문합니다.");
        System.out.println(pizza.toString());

    }

}