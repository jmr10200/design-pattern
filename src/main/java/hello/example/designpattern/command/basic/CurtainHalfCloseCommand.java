package hello.example.designpattern.command.basic;

/**
 * ConcreteCommand
 * 구체적인 명령, 구체적인 커맨드 (주문서, 명령자)
 */
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
