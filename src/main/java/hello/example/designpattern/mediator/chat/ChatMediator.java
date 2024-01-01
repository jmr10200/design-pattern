package hello.example.designpattern.mediator.chat;


/**
 * 중재자 인터페이스
 */
public interface ChatMediator {
    void sendMessage(String message, User user);

    void addUser(User user);
}
