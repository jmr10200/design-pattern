package hello.example.designpattern.adapter;

import org.junit.jupiter.api.Test;

class DuckTest {

    @Test
    void duck() {
        MallardDuck duck = new MallardDuck();

        // Turkey 를 생성
        WildTurkey turkey = new WildTurkey();
        // 생성한 Turkey 를 어댑터를 통하여 Duck 을 이용
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The WildTurkey says...");
        turkey.gobble(); // 칠면조 꽥~!
        turkey.fly(); // 칠면조는 짧은 거리만 날 수 있어요

        System.out.println("The MallardDuck says...");
        testDuck(duck);
        // duck.quack() → MallardDuck 꽥!
        // duck.fly() → MallardDuck 날고 있어요~

        System.out.println("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);
        // 칠면조 꽥~!
        // 칠면조는 짧은 거리만 날 수 있어요
        // 칠면조는 짧은 거리만 날 수 있어요
        // 칠면조는 짧은 거리만 날 수 있어요
        // → 어댑터가 gobble 할때 fly()를 여러번 호출한다.
        // testDuck()는 turkey 가 duck 으로 숨겨져있는지 모른다!
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}