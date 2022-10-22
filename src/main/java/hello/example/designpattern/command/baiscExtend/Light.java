package hello.example.designpattern.command.baiscExtend;

public class Light {

    String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("Light ON!");
    }

    public void off() {
        System.out.println("Light OFF!");
    }
}
