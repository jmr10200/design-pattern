package hello.example.designpattern.facade;

public class TheaterLights {
    String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " 전원 on");
    }

    public void off() {
        System.out.println(description + " 전원 off");
    }

    public void dim(int level) {
        System.out.println(description + " 조정 to " + level + " %");
    }

    @Override
    public String toString() {
        return "TheaterLights{" +
                "description='" + description + '\'' +
                '}';
    }
}
