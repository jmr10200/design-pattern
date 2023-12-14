package hello.example.designpattern.decorator.yuki;

public class FullBorder extends Border {

    // Constructor
    public FullBorder(Display display) {
        super(display);
    }

    // 행(col)수는 내용물의 양쪽에 장식 문자만큼 더한 것
    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    // 행(col)수는 내용물의 행(col)수와 같음
    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int num) {
        if (num == 0) {
            // 상단 테두리
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (num == display.getRows() + 1) {
            // 하단 테두리
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {
            // 기타
            return "|" + display.getRowText(num - 1)+ "|";
        }
    }

    // 문자 chr로 count 수 만큼 연속한 문자열 생성
    private String makeLine(char chr, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(chr);
        }
        return sb.toString();
    }
}
