package hello.example.designpattern.factory.abstractfactory;

public interface PizzaIngredientFactory {

    public Dough createDough();

    public Cheese createCheese();

    public Fruits createFruits();

    public Pepperoni createPepperoni();

    public Veggies[] createVeggies();

    public Sauce createSauce();
}
