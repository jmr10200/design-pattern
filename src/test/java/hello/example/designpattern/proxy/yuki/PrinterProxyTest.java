package hello.example.designpattern.proxy.yuki;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterProxyTest {

    @Test
    void main() {
        Printable p = new PrinterProxy("Billy");
        System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
        p.setPrinterName("Charlie");
        System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
        p.print("Hello, Proxy!!");
    }

}