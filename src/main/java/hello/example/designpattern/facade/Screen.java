package hello.example.designpattern.facade;

public class Screen {
    String description;

    public Screen(String description) {
        this.description = description;
    }

    public void up() {
        System.out.println(description + " 올리기!");
    }

    public void down() {
        System.out.println(description + " 내리기!");
    }

    @Override
    public String toString() {
        return "Screen{" +
                "description='" + description + '\'' +
                '}';
    }
}
