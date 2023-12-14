package hello.example.designpattern.decorator.food;

/**
 * Concrete Decorator B
 */
public class TomatoDecorator extends SandwichDecorator {

    public TomatoDecorator(Sandwich decoratedSandwich) {
        // 부모 클래스의 SandwichDecorator 생성자를 호출
        super(decoratedSandwich);
    }

    @Override
    public String getDescription() {
        // 부모 설명에 토마토 설명 추가
        return super.getDescription() + ", Tomato";
    }

    @Override
    public int cost() {
        return super.cost() + 1500;
    }
}
