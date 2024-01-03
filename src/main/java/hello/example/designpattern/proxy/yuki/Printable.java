package hello.example.designpattern.proxy.yuki;

public interface Printable {
    // 이름 설정
    void setPrinterName(String name);

    // 이름 취득
    String getPrinterName();

    // 문자열 표시 (print out)
    void print(String string);
}
