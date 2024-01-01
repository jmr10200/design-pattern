package hello.example.designpattern.mediator.chat;

/**
 * ConcreteColleague
 */
public class ChatUser extends User {
    public ChatUser(String name, ChatMediator mediator) {
        super(name, mediator);
    }

    // 사용자간 직접 전달
    public void sendDirectMessage(String message, User receiver) {
        System.out.println("-------------------------------------------");
        System.out.println("[" + this.getName() + "] sends a direct message to [" + receiver.getName() + "]: " + message);
        System.out.println("-------------------------------------------");
        receiver.receiveMessage(message);
    }
}
