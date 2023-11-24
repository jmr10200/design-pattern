package hello.example.designpattern.templatemethod.yuki;

public class StringDisplay extends AbstractDisplay {
    private String string; // 표시해야 하는 문자열
    private int width; // 문자열 길이

    // constructor
    public StringDisplay(String string) {
        this.string = string;
        this.width = string.length();
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    // open() 과 close() 에서 호출되어 "+----+" 문자열을 표시
    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
