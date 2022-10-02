package hello.example.designpattern.decorator.baverageno;

public abstract class ExtraDecorator extends BeverageNo {
    BeverageNo beverage;
    public abstract String getDescription();
}
