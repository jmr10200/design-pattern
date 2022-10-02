package hello.example.designpattern.decorator.beverage;

public class Whip extends ExtraDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Integer cost() {
        return beverage.cost() + CostConstant.WHIP_COST;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑";
    }
}
