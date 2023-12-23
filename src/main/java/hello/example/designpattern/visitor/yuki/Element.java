package hello.example.designpattern.visitor.yuki;

/**
 * 방문자를 받아들이는 인터페이스
 */
public interface Element {
    // visitor 를 받아들인다(accept)
    public abstract void accept(Visitor visitor);
}
