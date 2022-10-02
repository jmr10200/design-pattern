package hello.example.designpattern.decorator.beverage;

public class Drip extends Beverage {

    public Drip() {
        description = "드립 커피";
    }

    @Override
    public Integer cost() {
        return CostConstant.DRIP_COST;
    }
}
