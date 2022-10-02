package hello.example.designpattern.decorator.beverage;

public class Espresso extends Beverage {
    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public Integer cost() {
        return CostConstant.ESPRESSO_COST;
    }
}
