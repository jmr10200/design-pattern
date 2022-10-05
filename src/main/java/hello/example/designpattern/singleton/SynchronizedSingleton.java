package hello.example.designpattern.singleton;

/**
 * 동기화 (synchronized) 키워드 사용 싱글톤
 */
public class SynchronizedSingleton {

    private static SynchronizedSingleton uniqueInstance;

    private SynchronizedSingleton() {}

    // 문제 : 동기화는 오버헤드 증가 문제 (성능 문제)
    public static synchronized SynchronizedSingleton getInstance(){
        if (uniqueInstance == null) {
            uniqueInstance = new SynchronizedSingleton();
        }
        return uniqueInstance;
    }
}
