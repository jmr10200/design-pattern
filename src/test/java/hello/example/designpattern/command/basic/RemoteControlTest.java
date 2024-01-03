package hello.example.designpattern.command.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoteControlTest {

    @Test
    @DisplayName("Client")
    void basic() {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        LightOnCommand onCommand = new LightOnCommand(light);

        remoteControl.setCommand(onCommand);
        // 클라이언트가 버튼을 누르면 LightOnCommand 가 실행되어 전등이 켜진다.
        remoteControl.buttonWasPressed();

        // Off 명령
        LightOffCommand offCommand = new LightOffCommand(light);

        remoteControl.setCommand(offCommand);
        // 클라이언트가 버튼을 누르면 LightOffCommand 가 실행되어 전등이 켜진다.
        remoteControl.buttonWasPressed();

        Curtain curtain = new Curtain();
        CurtainOpenCommand openCommand = new CurtainOpenCommand(curtain);

        remoteControl.setCommand(openCommand);
        remoteControl.buttonWasPressed();

        CurtainHalfCloseCommand halfCloseCommand = new CurtainHalfCloseCommand(curtain);

        remoteControl.setCommand(halfCloseCommand);
        remoteControl.buttonWasPressed();
    }
}