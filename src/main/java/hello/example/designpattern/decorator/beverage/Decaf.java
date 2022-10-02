package hello.example.designpattern.decorator.beverage;

public class Decaf extends Beverage{

    public Decaf() {
        description = "디카페인";
    }

    @Override
    public Integer cost() {
        return CostConstant.DECAF_COST;
    }
}
