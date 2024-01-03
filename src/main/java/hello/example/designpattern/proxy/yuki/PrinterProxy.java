package hello.example.designpattern.proxy.yuki;

public class PrinterProxy implements Printable {

    // 이름
    private String name;

    // '본인'
    private Printer real;

    // constructor
    public PrinterProxy() {
        this.name = "No Name";
        this.real = null;
    }

    // constructor (이름지정)
    public PrinterProxy(String name) {
        this.name = name;
        this.real = null;
    }

    // 이름 설정
    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            // '본인'에게도 설정
            real.setPrinterName(name);
        }
        this.name = name;
    }

    // 이름 취득
    @Override
    public String getPrinterName() {
        return name;
    }

    // 표시
    @Override
    public void print(String string) {
        // 실제 프린트 단계가 되어서야 인스턴스 생성
        realize();
        real.print(string);
    }

    // 본인 생성
    private synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }
}
