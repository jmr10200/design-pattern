package hello.example.designpattern.decorator.beverage;

public abstract class ExtraDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
