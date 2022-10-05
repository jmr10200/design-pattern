package hello.example.designpattern.singleton;

/**
 * DCL (Double-Checking Locking) 사용 싱글톤
 */
public class DoubleCheckingLockingSingleton {

    // 문제 : volatile 을 사용 (모든 JVM 구현에서 작동 보장 X)
    private volatile static DoubleCheckingLockingSingleton uniqueInstance;

    private DoubleCheckingLockingSingleton() {}

    public static DoubleCheckingLockingSingleton getInstance() {
        // 먼저 인스턴스가 생성되었는지 확인 한 후
        if (uniqueInstance == null) {
            // 생성되지 않았을때만 synchronized 사용
            synchronized (DoubleCheckingLockingSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckingLockingSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
