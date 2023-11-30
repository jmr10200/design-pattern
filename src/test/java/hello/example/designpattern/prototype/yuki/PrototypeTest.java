package hello.example.designpattern.prototype.yuki;

import hello.example.designpattern.prototype.yuki.framework.Manager;
import hello.example.designpattern.prototype.yuki.framework.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {

    @Test
    void main() {
        // 준비
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');

        // 등록
        // strong message 이름으로 UnderlinePen 에서 ulchar 가 '-' 인 인스턴스를 등록
        manager.register("strong message", upen);
        manager.register("warning box", mBox);
        manager.register("slash box", sBox);

        // 생성 및 사용
        Product strong = manager.create("strong message");
        strong.use("Hello, Strong Message");
        System.out.println();

        Product warning = manager.create("warning box");
        warning.use("Hello, Warning Box");
        System.out.println();

        Product slash = manager.create("slash box");
        slash.use("Hello, Slash Box");
    }

}