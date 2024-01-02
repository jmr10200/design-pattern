package hello.example.designpattern.observer.yuki;

import org.junit.jupiter.api.Test;

class NumberObserverTest {

    @Test
    void main() {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();

        generator.addObserver(observer1);
        generator.addObserver(observer2);

        generator.execute();
    }

    @Test
    void main2() {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        Observer observer3 = new StarsObserver();

        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);

        generator.deleteObserver(observer2);

        generator.execute();
    }

}