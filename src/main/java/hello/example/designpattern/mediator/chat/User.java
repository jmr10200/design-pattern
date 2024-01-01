package hello.example.designpattern.mediator.chat;

/**
 * Colleague (동료)
 */
public class User {
    private String name;
    private ChatMediator mediator;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    // getter
    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        System.out.println("-------------------------------------------");
        System.out.println("[" + name + "] sends message: " + message);
        System.out.println("-------------------------------------------");
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println("[" + name + "] receives message: " + message);
    }
}
