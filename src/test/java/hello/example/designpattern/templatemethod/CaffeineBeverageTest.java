package hello.example.designpattern.templatemethod;

import org.junit.jupiter.api.Test;

public class CaffeineBeverageTest {

    @Test
    void coffeeBrew() {
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }

    @Test
    void teaBrew() {
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }

    @Test
    void coffeeBrewWithExtra() {
        CaffeineBeverage coffeeWithExtra = new Coffee();
        coffeeWithExtra.setCustomerWantsExtra(true);
        coffeeWithExtra.prepareRecipe();
    }

    @Test
    void teaBrewWithExtra() {
        CaffeineBeverage teaWithExtra = new Tea();
        teaWithExtra.setCustomerWantsExtra(true);
        teaWithExtra.prepareRecipe();
    }
}
