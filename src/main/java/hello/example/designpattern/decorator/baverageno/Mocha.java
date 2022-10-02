package hello.example.designpattern.decorator.baverageno;

import hello.example.designpattern.decorator.beverage.CostConstant;

public class Mocha extends ExtraDecorator {

    public Mocha(BeverageNo beverage) {
        this.beverage = beverage;
    }

    @Override
    public Integer cost() {
        return beverage.cost() + CostConstant.MOCHA_COST;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카시럽";
    }
}
