package hello.example.designpattern.flyweight.yuki;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigCharFlyweightTest {

    @Test
    void main() {
        String testStr = "1212123";
        BigString bs = new BigString(testStr);
        bs.print();
    }

    @Test
    void main2() {
        BigChar bc = new BigChar('3');
        bc.print();
    }

}