package hello.example.designpattern.singleton.yuki;

import java.util.Optional;

public enum Trio {
    ALPHA,
    BETA,
    GAMMA;

    private Trio() {
        System.out.println(this + " 인스턴스 생성");
    }

    public static Trio getInstance(String name) {
        Trio trio = null;
        try {
            trio = valueOf(name); // enum 의 메소드로 문자열 표현에서 인스턴스 얻을 수 있다.
        } catch (IllegalArgumentException e) {
            System.out.println(name + " (으)로 생성된 인스턴스가 없습니다.");
        }
        return trio;
    }
}
