package hello.example.designpattern.singleton;

/**
 * static inner 사용 싱글톤
 */
public class StaticInnerSingleton {

    private StaticInnerSingleton() {}

    // static inner 클래스 사용
    private static class SingletonHolder {
        private static final StaticInnerSingleton UNIQUE_INSTANCE = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.UNIQUE_INSTANCE;
    }
}
