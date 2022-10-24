package hello.example.designpattern.factory.abstractfactory;

import hello.example.designpattern.factory.PizzaType;
import hello.example.designpattern.factory.abstractfactory.pizzaimpl.HawaiianPizza;
import hello.example.designpattern.factory.abstractfactory.pizzaimpl.PepperoniPizza;
import hello.example.designpattern.factory.abstractfactory.pizzaimpl.VeggiePizza;

public class BusanPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new BusanIngredientFactory();

        if (item.equals(PizzaType.PEPPERONI)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("부산 스타일 페페로니 피자");
        } else if (item.equals(PizzaType.HAWAIIAN)) {
            pizza = new HawaiianPizza(ingredientFactory);
            pizza.setName("부산 스타일 하와이안 피자");
        } else if (item.equals(PizzaType.VEGGIE)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("부산 스타일 베지테리안 피자");
        }
        return pizza;
    }
}
