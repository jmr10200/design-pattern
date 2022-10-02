package hello.example.designpattern.strategy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class DuckTest {

    @Test
    void redHeadDuck() {
        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performQuack();
        redHeadDuck.swim();
        redHeadDuck.performFly();
    }

    @Test
    void mallardDuck() {
        Duck mallardDuck = new MallardDuck(
                // 람다식으로도 가능
                () -> System.out.println("날까?"),
                () -> System.out.println("꽥꽥꽥꽥")
        );
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.swim();
        mallardDuck.performFly();
    }
    @Test
    void rubberDuck() {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.swim();
        rubberDuck.performFly();
    }
}