package hello.example.designpattern.decorator.baverageno;

public class Soy extends ExtraDecorator {

    public Soy(BeverageNo beverage) {
        this.beverage = beverage;
    }

    @Override
    public Integer cost() {
        return beverage.cost() + CostConstant.SOY_COST;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }
}
