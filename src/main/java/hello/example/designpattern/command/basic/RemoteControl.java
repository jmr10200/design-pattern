package hello.example.designpattern.command.basic;

/**
 * invoker 클래스 (호출자)
 */
public class RemoteControl {

    Command command;

    public RemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }

}
