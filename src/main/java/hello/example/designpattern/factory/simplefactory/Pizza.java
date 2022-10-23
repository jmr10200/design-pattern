package hello.example.designpattern.factory.simplefactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Pizza 추상 클래스
 */
public abstract class Pizza {

    String name; // 피자이름
    String dough; // 도우
    String sauce; // 소스
    List<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("preparing... " + name);
    }

    public void bake() {
        System.out.println("baking... " + name);
    }

    public void cut() {
        System.out.println("cutting... " + name);
    }

    public void box() {
        System.out.println("boxing... " + name);
    }

    @Override
    public String toString() {
        // 피자 정보 표시
        StringBuilder sb = new StringBuilder();
        sb.append("===== " + name + " =====\n");
        sb.append("dough = " + dough + "\n");
        sb.append("sauce = " + sauce + "\n");
        for (String topping : toppings) {
            sb.append("toppings = " + topping + "\n");
        }
        return sb.toString();
    }
}
