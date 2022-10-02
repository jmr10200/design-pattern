package hello.example.designpattern.decorator;

import hello.example.designpattern.decorator.baverageno.BeverageNo;
import hello.example.designpattern.decorator.baverageno.CostConstant;
import hello.example.designpattern.decorator.baverageno.Espresso;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static hello.example.designpattern.decorator.baverageno.CostConstant.*;

@Slf4j
public class BeverageNoTest {

    @Test
    void espWithWhipAndMocha() {
        BeverageNo esp = new Espresso();
        esp.setMocha(true);
        esp.setWhip(true);
        log.info("esp.getDescription = {} | cost = {}"
                , esp.getDescription(), esp.cost());
        Assertions.assertThat(esp.cost())
                .isEqualTo(ESPRESSO_COST + MOCHA_COST + WHIP_COST);
    }
}
