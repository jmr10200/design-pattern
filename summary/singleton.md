# 5. 싱글톤 패턴 (Singleton Pattern)
> 해당 클래스의 인스턴스가 하나만 만들어지고, 어디서든지 그 인스턴스에 접근할 수 있도록 하기위한 패턴

>> * 지정한 클래스의 인스턴스가 반드시 1개만 존재한다는 것을 보증하고 싶을 때
>> * 인스턴스가 하나만 존재한다는 것을 프로그램 상에서 표현하고 싶을 때
>
> singleton 이란 요소가 하나뿐인 집합을 의미하여 붙여진 이름이다. <br>
> 즉, **인스턴스가 1개만 존재한다는 것을 보증하는 패턴**이다.

* 블로그 링크 : [클릭](https://gymdev.tistory.com/17)
* 블로그 관련 소스코드 : [클릭](https://github.com/jmr10200/design-pattern/tree/master/src/main/java/hello/example/designpattern/singleton)

<br>

### (1) Singleton 클래스의 생성자는 private
Singleton 클래스의 생성자는 private 로 선언한다. **외부에서 생성자 호출을 금지하기 위해서**이다. <br>
싱글톤 패턴은 인스턴스가 1개라는 것을 보증해야 하기 때문에 private 로 해 두는 것이다. <br>

유일한 인스턴스를 얻는 메소드로 getInstance() 를 제공한다. <br>
이 메소드는 static Factory Method 의 일종이다.

### (2) Singleton 은 유일한 인스턴스를 얻기 위한 static 메소드를 가진다.
static method (정적메소드)는 인스턴스를 생성하지 않고도 클래스 레벨에서 직접 호출할 수 있는 메소드를 정의할 때 사용된다. <br>
그래서 new 로 생성하지 않고 getInstance() 의 static 메소드를 제공하여 유일한 인스턴스를 얻도록 한다.

```java
public class Singleton {

    private static Singleton singleton = new Singleton();

    // constructor
    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
```

<br><hr>

## # 정리

### 1. 인스턴스를 얻기위한 static 메소드를 만들어 외부에서 new 로 생성되지 않도록 생성자를 private 로 만든다.

<br>

### 2. 유일한 인스턴스를 보장한다면 그 전제 조건 하에서 프로그래밍 할 수 있다.
어떤 클래스에 대해 단 하나의 인스턴스만 필요한 경우 싱글톤 패턴을 사용한다.<br>
예를 들어, 설정 매니저, 로깅 서비스, 데이터베이스 연결 등과 같은 리소스의 효율적인 관리를 위해 인스턴스를 하나만 생성하여 프로그래밍 할 수 있다.

<br>

### 3. enum 을 이용한 싱글톤 패턴도 구현할 수 있다.
enum 의 요소는 상수로서 하나만 생성되므로 인스턴스의 유일성을 보증받는다. 
java.time.Month.OCTOBER 는 10월을 나타내는 시스템에서 유일한 인스턴스이다. 
그러므로 요소를 하나만 가지는 enum 을 이용하여 다음과같이 singleton 패턴을 구현할 수 있다.

```java
enum Singleton {
    INSTANCE; // enum 상수
    
    public void someMethod() {
        System.out.println("someMethod() is called.");
    }
}
```
유일한 인스턴스는 다음과 같이 접근할 수 있다.
```java
Singleton.INSTANCE; // 유일한 인스턴스
Singleton.INSTANCE.someMethod(); // 메소드 호출
```

<br>

### 4. 멀티스레딩 환경에서 주의있게 사용해야 한다.

<br>

#### (1) 인스턴스 중복 생성 문제:
멀티스레딩 환경에서 여러 스레드가 동시에 싱글톤 인스턴스를 확인할 때, 두 개 이상의 스레드가 동시에 생성하려고 하는 문제가 발생할 수 있다.

<br>

#### (2) 초기화 문제:
멀티스레딩 환경에서 싱글톤 클래스의 인스턴스가 초기화되는 동안 여러 스레드가 동시에 접근하면, 초기화가 끝나지 않은 상태의 인스턴스에 접근할 수 있다.

<br>

#### [해결 방법 1] 지연 초기화 (Lazy Initialization)
synchronized 키워드를 사용하여 메소드를 동기화 시킨다. <br>
한 스레드가 메소드에 접근 중일 때 다른 스레드는 대기하게 된다. 단, 이 방법은 성능 저하를 일으킬 수 있다. <br>
* [소스보기 : SynchronizedSingleton.java](../src/main/java/hello/example/designpattern/singleton/SynchronizedSingleton.java) <br>
```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

<br>

#### [해결 방법 2] DCL (Double-Checked Locking) 사용하여 동기화 부분 줄이기
멀티스레딩 환경에서 데이터의 일관성과 안정성을 보장하기 위해 사용하는 volatile 키워드를 사용하여 인스턴스의 변경 사항이 다른 스레드에 즉시 반영되도록 한다. <br>
그러나 이 방법도 성능 저하를 일으킬 수 있다. <br>
* [소스보기 : DoubleCheckingLockingSingleton.java](../src/main/java/hello/example/designpattern/singleton/DoubleCheckingLockingSingleton.java) <br>
```java
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```

<br>

### [해결 방법 3] 내부 정적 클래스 사용하기 (static inner class, Bill Pugh Singleton)
내부 정적 클래스를 사용하여 싱글톤 인스턴스를 생성하면서, 클래스 로딩 시점에서 초기화되므로 스레드 안전하며 성능이 우수하다.
* [소스보기 : StaticInnerSingleton.java](../src/main/java/hello/example/designpattern/singleton/StaticInnerSingleton.java) <br>
```java
public class Singleton {
    private Singleton() {}

    private static class SingletonHolder { // 내부 정적 클래스 사용
        private static final Singleton UNIQUE_INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.UNIQUE_INSTANCE;
    }
}
```

<br>

### [해결 방법 4] enum 사용하기 
enum 사용한 싱글톤 패턴은 자바에서 간편하고 안전하게 싱글톤을 구현하는 방법 중 하나이다. <br>
열거형(enum) 상수는 JVM 에서 하나의 인스턴스로만 생성되기 때문에 이를 이용하여 싱글톤을 만드는 것이다.<br>
**유일한 인스턴스 생성**으로 **스레드 안정성이 보장**되며, enum 은 **직렬화** 처리가 자동으로 이루어져 직렬화된 객체를 역직렬화할 때에도 항상 같은 인스턴스를 반환한다.<br>

* [예제 소스보기 : Trio.java](../src/main/java/hello/example/designpattern/singleton/yuki/Trio.java) <br>
```java
public enum Singleton {
    INSTANCE;
    // 싱글톤 인스턴스의 멤버 변수 및 메소드 추가 가능
    private String data;
    
    // getter, setter etc...
}
/** 사용할 때 **/
public class Main {
    public static void main(String[] args) {
        // 싱글톤 인스턴스 접근
        Singleton singleton = Singleton.INSTANCE;
    }
}
```