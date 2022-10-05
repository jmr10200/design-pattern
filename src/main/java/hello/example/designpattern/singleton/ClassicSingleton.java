package hello.example.designpattern.singleton;

/**
 * 고전적인 Singleton
 * 문제 : 쓰레드세이프 하지 않다.
 */
public class ClassicSingleton {

    private static ClassicSingleton uniqueInstance;

    private ClassicSingleton(){}

    // 멀티쓰레드 환경에서 객체가 여러개 생성된다.
    public static ClassicSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ClassicSingleton();
        }
        return uniqueInstance;
    }
}
