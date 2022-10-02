package hello.example.designpattern.decorator.baverageno;

import java.lang.module.Configuration;

public class Espresso extends BeverageNo {
    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public Integer cost() {
        Integer result = CostConstant.ESPRESSO_COST;
        if (milk) {
            result += CostConstant.WHOLE_MILK_COST;
        }
        if (soy) {
            result += CostConstant.SOY_COST;
        }
        if (mocha) {
            result += CostConstant.MOCHA_COST;
        }
        if (whip) {
            result += CostConstant.WHIP_COST;
        }
        return result;
    }
}
