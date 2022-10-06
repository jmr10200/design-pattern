package hello.example.designpattern.observer.basic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ObserverTest {

    @Test
    void basic() {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        ConcreteObserver concreteObserver = new ConcreteObserver(concreteSubject);

        concreteSubject.setValue(50);
        concreteObserver.display();
        assertThat(concreteObserver.getValue()).isEqualTo(50);

        concreteSubject.setValue(100);
        concreteObserver.display();
        assertThat(concreteObserver.getValue()).isEqualTo(100);

        // 제거하면 값이 변경되지 않는다.
        concreteSubject.removeObserver(concreteObserver);

        concreteSubject.setValue(33333);
        concreteObserver.display();
        assertThat(concreteObserver.getValue() != 33333).isTrue();
        assertThat(concreteObserver.getValue()).isEqualTo(100);
    }
}