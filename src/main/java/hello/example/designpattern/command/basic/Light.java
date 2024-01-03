package hello.example.designpattern.command.basic;

/**
 * Receiver
 */
public class Light {

    public Light() {
    }

    public void on() {
        System.out.println("Light ON!");
    }

    public void off() {
        System.out.println("Light OFF!");
    }
}
