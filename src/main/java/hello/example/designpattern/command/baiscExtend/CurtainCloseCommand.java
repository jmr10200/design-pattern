package hello.example.designpattern.command.baiscExtend;

public class CurtainCloseCommand implements Command {

    Curtain curtain;
    int prevLevel;

    public CurtainCloseCommand(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override
    public void execute() {
        prevLevel = curtain.getLevel();
        curtain.close();
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
