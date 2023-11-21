package hello.example.designpattern.adapter.yuki;

import hello.example.designpattern.adapter.yuki.delegation.PrintBannerByDelegation;
import hello.example.designpattern.adapter.yuki.delegation.PrintByDelegation;
import hello.example.designpattern.adapter.yuki.extend.Print;
import hello.example.designpattern.adapter.yuki.extend.PrintBanner;
import org.junit.jupiter.api.Test;

class PrintBannerTest {

    @Test
    void byExtends() {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }

    @Test
    void byDelegation() {
        PrintByDelegation print = new PrintBannerByDelegation("HELLO");
        print.printWeak();
        print.printStrong();
    }

}