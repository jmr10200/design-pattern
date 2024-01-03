package hello.example.designpattern.command.basic;

/**
 * ConcreteCommand
 * 구체적인 명령, 구체적인 커맨드 (주문서, 명령자)
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

}
