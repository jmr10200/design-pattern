package hello.example.designpattern.decorator.food;

/**
 * Concrete Component
 */
public class BasicSandwich implements Sandwich {
    @Override
    public String getDescription() {
        return "Basic Sandwich";
    }

    @Override
    public int cost() {
        return 4000;
    }
}
