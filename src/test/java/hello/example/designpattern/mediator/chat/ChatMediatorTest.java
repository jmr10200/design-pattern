package hello.example.designpattern.mediator.chat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChatMediatorTest {

    @Test
    void main() {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new User("Ariana", chatRoom);
        User user2 = new User("Billy", chatRoom);
        User user3 = new User("Charlie", chatRoom);

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("Hello, I'm Ariana");
    }

}