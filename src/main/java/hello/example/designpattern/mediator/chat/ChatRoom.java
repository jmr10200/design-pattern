package hello.example.designpattern.mediator.chat;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Mediator
 */
public class ChatRoom implements ChatMediator {

    private List<User> userList;

    public ChatRoom() {
        this.userList = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : userList) {
            // 메시지를 보낸 사용자를 제외하고 모든 사용자에게 메시지 전달
            if (!u.equals(user)) {
                u.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }
}
