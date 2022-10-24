package hello.example.designpattern.factory.abstractfactory.pizzaimpl;

import hello.example.designpattern.factory.abstractfactory.Pizza;
import hello.example.designpattern.factory.abstractfactory.PizzaIngredientFactory;

public class HawaiianPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public HawaiianPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing... " + name);
        dough = ingredientFactory.createDough();
        pepperoni = ingredientFactory.createPepperoni();
        fruits = ingredientFactory.createFruits();
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
    }
}
