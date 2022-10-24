package hello.example.designpattern.factory.abstractfactory;

import hello.example.designpattern.factory.PizzaType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaStoreTest {

    @Test
    void abstractFactory() {
        PizzaStore seoulStore = new SeoulPizzaStore();
        PizzaStore busanStore = new BusanPizzaStore();

        Pizza seoul1 = seoulStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println("서울 피자 주문 1");
        Pizza seoul2 = seoulStore.orderPizza(PizzaType.VEGGIE);
        System.out.println("서울 피자 주문 2");
        Pizza seoul3 = seoulStore.orderPizza(PizzaType.HAWAIIAN);
        System.out.println("서울 피자 주문 3");
        Pizza busan1 = busanStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println("부산 피자 주문 1");
        Pizza busan2 = busanStore.orderPizza(PizzaType.VEGGIE);
        System.out.println("부산 피자 주문 2");
        Pizza busan3 = busanStore.orderPizza(PizzaType.HAWAIIAN);
        System.out.println("부산 피자 주문 3");

    }
}