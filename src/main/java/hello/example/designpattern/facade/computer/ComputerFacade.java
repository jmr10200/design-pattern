package hello.example.designpattern.facade.computer;

/**
 * Facade (파사드)
 */
public class ComputerFacade {
    private Cpu cpu;
    private Memory memory;
    private HardDiskDrive hdd;
    private Power power;

    public ComputerFacade() {
        this.power = new Power();
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.hdd = new HardDiskDrive();
    }

    // 컴퓨터 켜기
    public void start() {
        power.on();
        cpu.start();
        memory.load();
        hdd.read();
        System.out.println("Computer is started!!");
    }
}
