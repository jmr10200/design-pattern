package hello.example.designpattern.facade.computer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerFacadeTest {

    @Test
    void main() {
        // 클라이언트는 파사드를 통해 컴퓨터 기동
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }

}