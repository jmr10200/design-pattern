package hello.example.designpattern.factory.abstractfactory.pizzaimpl;

import hello.example.designpattern.factory.abstractfactory.Cheese;
import hello.example.designpattern.factory.abstractfactory.Pizza;
import hello.example.designpattern.factory.abstractfactory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing... " + name);
        dough = ingredientFactory.createDough();
        pepperoni = ingredientFactory.createPepperoni();
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggies();
    }
}
