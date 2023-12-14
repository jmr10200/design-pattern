package hello.example.designpattern.decorator.yuki;

public class StringDisplay extends Display {

    // 표시 문자열
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.length();
    }

    @Override
    public int getRows() {
        return 1; // 행 수 1
    }

    @Override
    public String getRowText(int num) {
        if (num != 0) {
            throw new IndexOutOfBoundsException();
        }
        return string;
    }
}
