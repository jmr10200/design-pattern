package hello.example.designpattern.command.baiscExtend;

/**
 * 실행명령이 없는 초기화용 구현 커맨드
 */
public class NoCommand implements Command {
    @Override
    public void execute() {}
    @Override
    public void undo() {}
}
