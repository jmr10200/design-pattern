package hello.example.designpattern.singleton.yuki;

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
