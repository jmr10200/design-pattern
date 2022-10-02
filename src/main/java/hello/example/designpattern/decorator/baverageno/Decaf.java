package hello.example.designpattern.decorator.baverageno;

public class Decaf extends BeverageNo {

    public Decaf() {
        description = "디카페인";
    }

    @Override
    public Integer cost() {
        return CostConstant.DECAF_COST;
    }
}
