package hello.example.designpattern.facade.audio;

public class Tuner {
    String description;
    Amplifier amplifier;
    double frequency;

    public Tuner(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println(description + " 전원 on");
    }

    public void off() {
        System.out.println(description + " 전원 off");
    }

    public void setFrequency(double frequency) {
        System.out.println(description + " 주파수 설정 " + frequency);
        this.frequency = frequency;
    }

    public void setAm() {
        System.out.println(description + " set AM mode");
    }

    public void setFm() {
        System.out.println(description + " set FM mode");
    }

    @Override
    public String toString() {
        return "Tuner{" +
                "description='" + description + '\'' +
                '}';
    }
}
