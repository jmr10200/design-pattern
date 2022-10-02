package hello.example.designpattern.decorator.baverageno;

public class Drip extends BeverageNo {

    public Drip() {
        description = "드립 커피";
    }

    @Override
    public Integer cost() {
        return CostConstant.DRIP_COST;
    }
}
