package hello.example.designpattern.command.baiscExtend;

public class RemoteController {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    int buttonNum = 5;

    public RemoteController() {
        onCommands = new Command[buttonNum];
        offCommands = new Command[buttonNum];

        Command noCommand = new NoCommand();
        for (int i = 0; i < buttonNum; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPush(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonPush(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonPush() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n------ Remote Control mapping info -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        sb.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return sb.toString();
    }

}
