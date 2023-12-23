package hello.example.designpattern.visitor.yuki;

/**
 * Element 인터페이스를 구현
 * Entry 클래스를 Visitor 패턴에 맞추기 위함
 */
public abstract class Entry implements Element {

    // 이름 취득
    public abstract String getName();

    // 크기 취득
    public abstract int getSize();

    // 문자열 표현
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
