package hello.example.designpattern.factory.simplefactoryextend;

public abstract class PizzaStore {
    // Pizza 인스턴스를 만드는 일은 팩토리 역할을 하는 인스턴스에서
    public abstract Pizza createPizza(String item); // 팩토리 메소드 위한 인터페이스 제공

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("==== " + pizza.getName() + " 제작 ====");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
