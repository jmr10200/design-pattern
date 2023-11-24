package hello.example.designpattern.templatemethod.yuki;

public class CharDisplay extends AbstractDisplay {
    private char ch; // 표시해야 하는 문자

    // constructor
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        // 시작 문자열 "<<" 표시
        System.out.print("<<");
    }

    @Override
    public void print() {
        // 필드에 저장해 둔 문자를 1회 표시
        System.out.print(ch);
    }

    @Override
    public void close() {
        // 종료 문자열 ">>" 표시
        System.out.println(">>");
    }
}
