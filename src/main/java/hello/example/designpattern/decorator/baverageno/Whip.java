package hello.example.designpattern.decorator.baverageno;

import hello.example.designpattern.decorator.beverage.CostConstant;

public class Whip extends ExtraDecorator {

    public Whip(BeverageNo beverage) {
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
