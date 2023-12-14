package hello.example.designpattern.decorator.yuki;

public abstract class Display {

    // 문자의 행(column) 수 취득
    public abstract int getColumns();

    // 문자의 열(row) 수 취득
    public abstract int getRows();

    // num 행째 문자열 취득
    public abstract String getRowText(int num);

    // 모든 행 표시
    public void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
