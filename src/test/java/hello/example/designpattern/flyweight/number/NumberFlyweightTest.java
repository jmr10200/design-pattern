package hello.example.designpattern.flyweight.number;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class NumberFlyweightTest {

    @Test
    void main() {
        NumberFactory numberFactory = new NumberFactory();

        // 클라이언트가 여러번 동일한 숫자를 요청
        Number number1 = numberFactory.getNumber(3);
        number1.printNumber();

        Number number2 = numberFactory.getNumber(15);
        number2.printNumber();
        // number1 인스턴스와 number2 는 다르다.
        assertThat(number2).isNotEqualTo(number1);

        Number number3 = numberFactory.getNumber(3);
        number3.printNumber(); // 이미 생성된 객체 공유하여 사용
        // number3 과 number1 는 동일하다 (같은 객체 공유한다, 참조한다)
        assertThat(number3).isEqualTo(number1);

        Number number4 = numberFactory.getNumber(57);
        number4.printNumber();

        Number number5 = numberFactory.getNumber(3);
        number5.printNumber(); // 이미 생성된 객체 공유하여 사용
        // number5 와 number3 는 동일하다 (같은 객체 공유한다, 참조한다)
        assertThat(number5).isEqualTo(number3);
        // number5 와 number1 는 동일하다 (같은 객체 공유한다, 참조한다)
        assertThat(number5).isEqualTo(number1);

        Number number6 = numberFactory.getNumber(3);
        number6.printNumber(); // 이미 생성된 객체 공유하여 사용
    }

}