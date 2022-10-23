package hello.example.designpattern.factory.simplefactoryextend;

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

    public void prepare() {
        System.out.println("preparing... " + name);
        System.out.println("tossing dough...");
        System.out.println("adding sauce...");
        System.out.println("adding toppings...");
        for (String topping : toppings) {
            System.out.println("    " + topping);
        }
    }

    public void bake() {
        System.out.println("baking... 350도에서 25분정도 구웁니다.");
    }

    public void cut() {
        System.out.println("cutting... 피자를 커팅합니다.");
    }

    public void box() {
        System.out.println("boxing... 박스에 넣습니다.");
    }

    public String getName() {
        return name;
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
