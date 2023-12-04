package hello.example.designpattern.builder.computer;

public interface ComputerBuilder {
    ComputerBuilder setCpu(String cpu);
    ComputerBuilder setRam(String ram);
    ComputerBuilder setGraphic(String graphic);
    ComputerBuilder setOs(String os);
    ComputerBuilder setStorage(String storage);
    Computer build();
}
