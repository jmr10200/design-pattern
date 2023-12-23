package hello.example.designpattern.visitor.yuki;

/**
 * Visitor : 방문자
 * 방문자는 방문하는 곳의 데이터구조(File, Directory)에 의존
 */
public abstract class Visitor {
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
