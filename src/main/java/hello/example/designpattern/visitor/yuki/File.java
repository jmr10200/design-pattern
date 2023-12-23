package hello.example.designpattern.visitor.yuki;

/**
 * Entry 하위 클래스
 */
public class File extends Entry {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void accept(Visitor v) {
        // Visitor 의 visit 메소드를 호출
        v.visit(this);// this 는 File 의 인스턴스
    }
}
