package hello.example.designpattern.builder.computer;

/**
 *  Product
 */
public class Computer {
    private String cpu;
    private String ram;
    private String graphic;
    private String os;
    private String storage;

    /**
     * private 생성자
     *
     * 빌더 패턴임을 강조하기 위함
     * 빌더 패턴은 객체 생성 과정을 캡슐화하고 복잡성을 숨기기 위한 것이며, 일반적으로 객체를 직접적으로 생성하는 것을 제한하여 불변성을 보장하는 것이 목적이기 때문
     *
     */
    private Computer() {
    }

    /**
     * 여기서는 정적 팩토리 메소드를 이용하여 객체 생성
     */
    public static Computer createComputer() {
        return new Computer();
    }

    // getter
    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getGraphic() {
        return graphic;
    }

    public String getOs() {
        return os;
    }

    public String getStorage() {
        return storage;
    }

    // setter
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setGraphic(String graphic) {
        this.graphic = graphic;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer {" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", graphic='" + graphic + '\'' +
                ", os='" + os + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }

}
