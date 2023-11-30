package hello.example.designpattern.builder.yuki;

public class Director {
    private Builder builder;

    // constructor
    public Director(Builder builder) {
        this.builder = builder;
    }

    // 문서를 만드는 메소드
    public void construct() {
        builder.makeTitle("Greeting");

        builder.makeString("General Greetings");
        builder.makeItems(new String[]{"How are you?", "Hello", "Hi"});

        builder.makeString("Greetings by Time of Day");
        builder.makeItems(new String[]{"Good morning", "Good afternoon", "Good evening"});

        builder.close();
    }
}
