package hello.example.designpattern.command.basic;

public class CurtainHalfCloseCommand implements Command {

    Curtain curtain;

    public CurtainHalfCloseCommand(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override
    public void execute() {
        curtain.halfClose();
    }
}
