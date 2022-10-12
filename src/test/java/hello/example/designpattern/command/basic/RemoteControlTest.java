package hello.example.designpattern.command.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoteControlTest {

    @Test
    void basic() {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        LightOnCommand onCommand = new LightOnCommand(light);

        remoteControl.setCommand(onCommand);
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