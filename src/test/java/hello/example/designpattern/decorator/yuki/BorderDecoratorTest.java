package hello.example.designpattern.decorator.yuki;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BorderDecoratorTest {

    @Test
    void main() {
        Display b1 = new StringDisplay("Border Decorator");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);

        System.out.println("== print StringDisplay ==");
        b1.show();
        System.out.println("== print SideBorder ==");
        b2.show();
        System.out.println("== print FullBorder ==");
        b3.show();
    }

    @Test
    void main2() {
        Display display = new SideBorder(new FullBorder(new FullBorder(
                new SideBorder(new FullBorder(new StringDisplay("Hello Decorator")),'*'))),'/');
        display.show();
    }
}