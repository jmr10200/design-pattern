package hello.example.designpattern.command.basic;

public class CurtainOpenCommand implements Command{
    Curtain curtain;

    public CurtainOpenCommand(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override
    public void execute() {
        curtain.open();
    }

}
