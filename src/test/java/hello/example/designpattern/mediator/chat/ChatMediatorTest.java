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

    @Test
    void main2() {
        ChatMediator chatRoom = new ChatRoom();

        ChatUser user1 = new ChatUser("Ari", chatRoom);
        ChatUser user2 = new ChatUser("Bailey", chatRoom);
        ChatUser user3 = new ChatUser("Catalina", chatRoom);
        ChatUser user4 = new ChatUser("Dorothy", chatRoom);

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);

        // 전체 메시지
        user1.sendMessage("Hello, guys~!!");

        // 특정인에게 메시지
        user2.sendDirectMessage("Dorothy, This is DM.", user4);
    }

}