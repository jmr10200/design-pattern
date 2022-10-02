package hello.example.designpattern.decorator.beverage;

public class WholeMilk extends ExtraDecorator {

    public WholeMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Integer cost() {
        return beverage.cost() + CostConstant.WHOLE_MILK_COST;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 일반 우유";
    }
}
