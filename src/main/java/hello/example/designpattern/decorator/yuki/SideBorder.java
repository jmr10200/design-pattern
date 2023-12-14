package hello.example.designpattern.decorator.yuki;

public class SideBorder extends Border {

    // 장식 문자
    private char borderChar;

    // 내용물이 될 Display 와 장식 문자 지정
    public SideBorder(Display display, char chr) {
        super(display);
        this.borderChar = chr;
    }

    // 행(col)수는 내용물의 양쪽에 장식 문자만큼 더한 것
    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    // 행(col)수는 내용물의 행(col)수와 같음
    @Override
    public int getRows() {
        return display.getRows();
    }

    // 지정 행의 내용은 내용물의 지정 행 양쪽에 장식 문자를 붙인 것
    @Override
    public String getRowText(int num) {
        return borderChar + display.getRowText(num) + borderChar;
    }
}
