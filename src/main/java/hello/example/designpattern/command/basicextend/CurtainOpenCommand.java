package hello.example.designpattern.command.basicextend;

public class CurtainOpenCommand implements Command {

    Curtain curtain;
    int prevLevel;

    public CurtainOpenCommand(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override
    public void execute() {
        prevLevel = curtain.getLevel();
        curtain.open();
    }

    @Override
    public void undo() {
        if (prevLevel == Curtain.OPEN) {
            curtain.open();
        } else if (prevLevel == Curtain.HALF_OPEN) {
            curtain.halfOpen();
        } else if (prevLevel == Curtain.CLOSE) {
            curtain.close();
        }
    }

}
