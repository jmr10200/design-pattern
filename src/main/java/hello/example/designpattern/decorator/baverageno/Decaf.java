package hello.example.designpattern.decorator.baverageno;

public class Decaf extends BeverageNo {

    public Decaf() {
        description = "๋์นดํ์ธ";
    }

    @Override
    public Integer cost() {
        return CostConstant.DECAF_COST;
    }
}
