package hello.example.designpattern.builder.computer;

public class DesktopComputerBuilder implements ComputerBuilder {
    private Computer computer = Computer.createComputer();

    @Override
    public ComputerBuilder setCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    @Override
    public ComputerBuilder setRam(String ram) {
        computer.setRam(ram);
        return this;
    }

    @Override
    public ComputerBuilder setGraphic(String graphic) {
        computer.setGraphic(graphic);
        return this;
    }

    @Override
    public ComputerBuilder setOs(String os) {
        computer.setOs(os);
        return this;
    }

    @Override
    public ComputerBuilder setStorage(String storage) {
        computer.setStorage(storage);
        return this;
    }

    @Override
    public Computer build() {
        return computer;
    }

}
