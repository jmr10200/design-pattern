package hello.example.designpattern.decorator.food;

/**
 * Concrete Decorator A
 */
public class CheeseDecorator extends SandwichDecorator {

    public CheeseDecorator(Sandwich decoratedSandwich) {
        super(decoratedSandwich);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public int cost() {
        return super.cost() + 1000;
    }
}
