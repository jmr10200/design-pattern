package hello.example.designpattern.builder.computer;

/**
 * Director (선택적으로 사용)
 */
public class ComputerDirector {

    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer constructGamingPC() {
        return builder.setCpu("Intel i9")
                .setRam("32GB")
                .setGraphic("GeForce RTX 4060 D6 8GB")
                .setStorage("2TB SSD")
                .setOs("windows 11 home")
                .build();
    }

    public Computer constructOfficePC() {
        return builder.setCpu("Intel i5")
                .setRam("16GB")
                .setGraphic("AMD RADEON 7")
                .setStorage("500GB HDD")
                .setOs("windows 11 home")
                .build();
    }
}
