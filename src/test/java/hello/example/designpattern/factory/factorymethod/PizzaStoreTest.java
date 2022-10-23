package hello.example.designpattern.factory.factorymethod;

import hello.example.designpattern.factory.PizzaType;
import org.junit.jupiter.api.Test;

class PizzaStoreTest {

    @Test
    void simpleExtend() {
        PizzaStore seoulStore = new SeoulPizzaStore();
        PizzaStore busanStore = new BusanPizzaStore();

        Pizza pizza = null;

        System.out.println("서울지점 1번 손님 주문");
        pizza = seoulStore.orderPizza(PizzaType.CHEESE);
        System.out.println();
        System.out.println("부산지점 2번 손님 주문");
        pizza = busanStore.orderPizza(PizzaType.HAWAIIAN);
        System.out.println();
        System.out.println("부산지점 3번 손님 주문");
        pizza = busanStore.orderPizza(PizzaType.CHEESE);
        System.out.println();
        System.out.println("서울지점 4번 손님 주문");
        pizza = seoulStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println();
        System.out.println("서울지점 5번 손님 주문");
        pizza = seoulStore.orderPizza(PizzaType.VEGGIE);
        System.out.println();
        System.out.println("부산지점 6번 손님 주문");
        pizza = busanStore.orderPizza(PizzaType.PEPPERONI);
    }

    @Test
    void simpleExtend2() {
        // 객체 생성을 캡슐화
        PizzaStore seoulStore = new SeoulPizzaStore();
        PizzaStore busanStore = new BusanPizzaStore();

        System.out.println("서울지점 1번 손님 주문");
        Pizza fistPizza = seoulStore.orderPizza(PizzaType.HAWAIIAN);
        System.out.println("부산지점 2번 손님 주문");
        Pizza secondPizza = busanStore.orderPizza(PizzaType.PEPPERONI);
    }
}