package hello.example.designpattern.templatemethod.yuki;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayTest {

    @Test
    void charDisplay() {
        // "H" 를 가진 CharDisplay 인스턴스 생성
        AbstractDisplay charDisplay = new CharDisplay('H');

        // AbstractDisplay 의 하위클래스 인스턴스 이므로 상속한 display() 메소드 호출
        // 실제 동작은 CharDisplay 클래스에서 정해진다
        charDisplay.display();
    }

    @Test
    void stringDisplay() {
        // "Hello, world" 를 가진 StringDisplay 인스턴스 생성
        AbstractDisplay stringDisplay = new StringDisplay("Hello, world");

        // AbstractDisplay 의 하위클래스 인스턴스 이므로 상속한 display() 메소드 호출
        // 실제 동작은 StringDisplay 클래스에서 정해진다
        stringDisplay.display();
    }

}