package hello.example.designpattern.flyweight.number;

import java.util.HashMap;
import java.util.Map;

/**
 * FlyweightFactory 플라이웨이트 팩토리
 */
public class NumberFactory {
    private Map<Integer, Number> numberCache = new HashMap<>();

    public Number getNumber(int value) {
        if (!numberCache.containsKey(value)) {
            // 캐시에 없으면 생성하여 저장
            System.out.println("new 객체를 새로 생성한다."); // 학습용 출력
            Number newNumber = new ConcreteNumber(value);
            numberCache.put(value, newNumber);
        } else {
            System.out.println("이미 생성되어 있는 객체를 가져온다."); // 학습용 출력
        }
        // 캐시에 있으면 캐시에서 가져온다.
        return numberCache.get(value);
    }
}
