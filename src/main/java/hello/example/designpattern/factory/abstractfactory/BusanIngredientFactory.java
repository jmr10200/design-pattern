package hello.example.designpattern.factory.abstractfactory;

import hello.example.designpattern.factory.abstractfactory.ingredientimpl.*;

public class BusanIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
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
        Veggies[] veggies = {new Onion(), new Spinach(), new Mushroom()};
        return veggies;
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
