package hello.example.designpattern.bridge.computer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BridgeComputerTest {

    @Test
    void laptopMain() {
        System.out.println("== Laptop 에 Windows 사용하기 ==");
        Computer laptop = new Laptop(new Windows());
        laptop.useComputer();

        System.out.println();

        System.out.println("== Laptop 에 MacOs 사용하기 ==");
        Computer macbook = new Laptop(new MacOS());
        macbook.useComputer();
    }

    @Test
    void desktopMain() {
        System.out.println("== Desktop 에 Windows 사용하기 ==");
        Computer desktop = new Desktop(new Windows());
        desktop.useComputer();

        System.out.println();

        System.out.println("== Desktop 에 MacOs 사용하기 ==");
        Computer mac = new Desktop(new MacOS());
        mac.useComputer();
    }

}