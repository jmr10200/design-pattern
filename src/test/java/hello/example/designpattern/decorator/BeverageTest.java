package hello.example.designpattern.decorator;

import hello.example.designpattern.decorator.beverage.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@Slf4j
public class BeverageTest {

    @Test
    void espresso() {
        Beverage esp = new Espresso();
        log.info("espresso.getDescription = {} | cost = {}"
                , esp.getDescription(), esp.cost());
        assertThat(esp.cost()).isEqualTo(CostConstant.ESPRESSO_COST);
    }

    @Test
    void dripWithWholeMilk() {
        Beverage dripMilk = new Drip();
        dripMilk = new WholeMilk(dripMilk);
        log.info("dripWithWholeMilk.getDescription = {} | cost = {}"
                , dripMilk.getDescription(), dripMilk.cost());
        assertThat(dripMilk.cost())
                .isEqualTo(CostConstant.DRIP_COST + CostConstant.WHOLE_MILK_COST);
    }

    @Test
    void espressoWithSoyAndMocha() {
        Beverage esp = new Espresso();
        Beverage withSoy = new Soy(esp);
        Beverage withSoyMocha = new Mocha(withSoy);
        log.info("espressoWithSoyAndMocha.getDescription() = {}", withSoyMocha.getDescription());
        log.info("espressoWithSoyAndMocha.cost() = {}", withSoyMocha.cost());
        assertThat(withSoyMocha.cost()).isEqualTo(
                CostConstant.ESPRESSO_COST + CostConstant.SOY_COST + CostConstant.MOCHA_COST
        );
    }
}
