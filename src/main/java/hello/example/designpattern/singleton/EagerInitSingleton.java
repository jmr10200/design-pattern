package hello.example.designpattern.singleton;

/**
 * 이른 초기화 (eager initialization)
 * 인스턴스를 처음에 생성해둔다.
 */
public class EagerInitSingleton {

    // 문제 : 미리 생성해두기 때문에 사용하지않을때 생성하는 것은 자원낭비가 된다.
    private static EagerInitSingleton uniqueInstance = new EagerInitSingleton();

    private EagerInitSingleton() {}

    public static EagerInitSingleton getInstance() {
        return uniqueInstance;
    }
}
