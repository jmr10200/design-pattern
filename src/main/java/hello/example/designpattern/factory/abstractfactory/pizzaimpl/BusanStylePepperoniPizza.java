package hello.example.designpattern.factory.abstractfactory.pizzaimpl;

import hello.example.designpattern.factory.abstractfactory.Pizza;
import hello.example.designpattern.factory.abstractfactory.PizzaIngredientFactory;

public class BusanStylePepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public BusanStylePepperoniPizza(PizzaIngredientFactory ingredientFactory) {
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

    @Override
    public void box() {
        System.out.println("부산 이벤트 박스에 넣습니다.");
    }
}
