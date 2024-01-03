package hello.example.designpattern.flyweight.number;

import org.junit.jupiter.api.Test;

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

        Number number3 = numberFactory.getNumber(3);
        number3.printNumber(); // 이미 생성된 객체 공유하여 사용

        Number number4 = numberFactory.getNumber(57);
        number4.printNumber();

        Number number5 = numberFactory.getNumber(3);
        number5.printNumber(); // 이미 생성된 객체 공유하여 사용

        Number number6 = numberFactory.getNumber(3);
        number6.printNumber(); // 이미 생성된 객체 공유하여 사용
    }

}