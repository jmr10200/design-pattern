package hello.example.designpattern.decorator.food;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SandwichDecoratorTest {

    @Test
    @DisplayName("기본 샌드위치")
    void basicMain() {
        Sandwich basic = new BasicSandwich();
        System.out.println("가격: " + basic.cost() + ", 설명: " + basic.getDescription());
    }

    @Test
    @DisplayName("기본 샌드위치에 치즈 추가")
    void cheeseMain() {
        Sandwich cheeseMain = new CheeseDecorator(new BasicSandwich());
        System.out.println("가격: " + cheeseMain.cost() + ", 설명: " + cheeseMain.getDescription());
    }

    @Test
    @DisplayName("기본 샌드위치에 치즈, 토마토 추가")
    void tomatoCheeseMain() {
        Sandwich tomatoCheese = new TomatoDecorator(new CheeseDecorator(new BasicSandwich()));
        System.out.println("가격: " + tomatoCheese.cost() + ", 설명: " + tomatoCheese.getDescription());
    }
}