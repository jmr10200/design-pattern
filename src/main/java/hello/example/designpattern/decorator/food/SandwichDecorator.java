package hello.example.designpattern.decorator.food;

/**
 * Decorator
 *
 * 데코레이터를 나타내는 추상 클래스
 */
public class SandwichDecorator implements Sandwich {

    // 상속 관계에서 하위 클래스에서 필드에 직접 접근할 수 있도록
    protected Sandwich decoratedSandwich;

    public SandwichDecorator(Sandwich decoratedSandwich) {
        this.decoratedSandwich = decoratedSandwich;
    }

    @Override
    public String getDescription() {
        return decoratedSandwich.getDescription();
    }

    @Override
    public int cost() {
        return decoratedSandwich.cost();
    }
}
