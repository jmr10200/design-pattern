package hello.example.designpattern.builder.computer;

import org.junit.jupiter.api.Test;

class ComputerBuilderTest {

    @Test
    void main() {
        ComputerBuilder builder = new DesktopComputerBuilder();

        // 빌더 패턴 직접 사용
        Computer officePC = builder.setCpu("Intel i5")
                .setRam("32GB")
                .setGraphic("N/A")
                .setStorage("1TB SSD")
                .setOs("Windows Server")
                .build();

        System.out.println("Office PC: " + officePC.toString());

        // Director 통한 빌더 패턴 사용
        ComputerDirector director = new ComputerDirector(builder);
        Computer gamingPC = director.constructGamingPC();

        System.out.println("Gaming PC: " + gamingPC.toString());
    }

}