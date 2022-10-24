package hello.example.designpattern.factory.abstractfactory;

import hello.example.designpattern.factory.abstractfactory.ingredientimpl.*;

public class SeoulIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new ParmesanCheese();
    }

    @Override
    public Fruits createFruits() {
        return new Pineapple();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Spinach(), new BlackOlives()};
        return veggies;
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
