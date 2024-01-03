package hello.example.designpattern.flyweight.yuki;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    // 이미 만든 BigChar 인스턴스를 관리
    private Map<String, BigChar> pool = new HashMap<>();
    // Singleton
    private static BigCharFactory singleton = new BigCharFactory();

    // 생성자
    private BigCharFactory() {

    }

    // 싱글톤 : 유일한 인스턴스
    public static BigCharFactory getInstance() {
        return singleton;
    }

    // BigChar 인스턴스 생성(공유)
    public synchronized BigChar getBigChar(char charName) {
        BigChar bigChar = pool.get(String.valueOf(charName));
        if (bigChar == null) {
            // 여기서 BigChar 인스턴스 생성
            bigChar = new BigChar(charName);
            pool.put(String.valueOf(charName), bigChar);
        }
        return bigChar;
    }
}
