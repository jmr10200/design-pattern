package hello.example.designpattern.decorator.beverage;

public class Decaf extends Beverage{

    public Decaf() {
        description = "๋์นดํ์ธ";
    }

    @Override
    public Integer cost() {
        return CostConstant.DECAF_COST;
    }
}
