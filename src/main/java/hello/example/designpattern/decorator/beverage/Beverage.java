package hello.example.designpattern.decorator.beverage;

/**
 * Beverage 추상 클래스
 */
public abstract class Beverage {

    String description = "무슨 음료";

    // getter
    public String getDescription() {
        return description;
    }

    /**
     * 추상 메소드 : 가격
     */
    public abstract Integer cost();
}
