package hello.example.designpattern.memento.yuki;

import java.util.ArrayList;
import java.util.List;

/**
 * Memonto 클래스
 * 주인공(Gamer) 의 상태를 나타내는 클래스
 */
public class Memento {

    // 소지금액
    private int money;
    // 과열
    private List<String> fruitList;

    // 소지금 취득 (narrow interface)
    public int getMoney() {
        return money;
    }

    // constructor (wide interface) :public 이 아님
    Memento(int money) {
        this.money = money;
        this.fruitList = new ArrayList<>();
    }

    // 과일 추가 (wide interface) :public 이 아님
    void addFruit(String fruit) {
        fruitList.add(fruit);
    }

    // 과일 취득 (wide interface) :public 이 아님
    List<String> getFruitList() {
        // 새로 객체 생성하고 기존의 fruitList 요소들을 복사한것이므로 원본 리스트에 영향 없다.
        return new ArrayList<>(fruitList);
    }
}
