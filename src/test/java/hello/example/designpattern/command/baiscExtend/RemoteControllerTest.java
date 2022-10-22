package hello.example.designpattern.command.baiscExtend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoteControllerTest {

    @Test
    void undoRemote() {

        // 명령 호출자 리모콘
        RemoteController remoteControl = new RemoteController();
        // 리시버 Light
        Light light = new Light("room light");
        // 명령 (command)
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        // 커맨드 셋팅 (첫번째 버튼엔 전등 스위치)
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);

        // 리모콘으로 명령 실행
        remoteControl.onButtonPush(0);
        remoteControl.offButtonPush(0);
        System.out.println("== undo 버튼으로 실행취소 ==");
        remoteControl.undoButtonPush();
        System.out.println(remoteControl);

        // Curtain 리시버
        Curtain curtain = new Curtain("room curtain");
        // 명령 (command)
        CurtainOpenCommand curtainOpenCommand = new CurtainOpenCommand(curtain);
        CurtainHalfOpenCommand curtainHalfOpenCommand = new CurtainHalfOpenCommand(curtain);
        CurtainCloseCommand curtainCloseCommand = new CurtainCloseCommand(curtain);
        // 버튼에 명령 (command) 셋팅 : 두번째 버튼에는 커튼 열고 닫기
        remoteControl.setCommand(1, curtainOpenCommand, curtainCloseCommand);
        // 버튼에 명령 (command) 셋팅 : 세번째 버튼에는 커튼 반만 열거나 완전히 열기
        remoteControl.setCommand(2, curtainCloseCommand, curtainHalfOpenCommand);
        // 리모콘 명령 실행
        remoteControl.onButtonPush(1);
        remoteControl.offButtonPush(1);
        System.out.println("== undo 버튼으로 실행취소 ==");
        remoteControl.undoButtonPush();
//        System.out.println(remoteControl);
        remoteControl.onButtonPush(2);
        remoteControl.offButtonPush(2);
        System.out.println("== undo 버튼으로 실행취소 ==");
        remoteControl.undoButtonPush();
        System.out.println(remoteControl);

        System.out.println("=== 전체 실행 버튼 추가해보기 ===");
        // 전체 실행 버튼 명령
        Command[] allOn = {lightOnCommand, curtainOpenCommand};
        Command[] allOff = {lightOffCommand, curtainCloseCommand};
        WholeCommand allOnCommand = new WholeCommand(allOn);
        WholeCommand allOffCommand = new WholeCommand(allOff);
        remoteControl.setCommand(4, allOnCommand, allOffCommand);
        remoteControl.onButtonPush(4);
        remoteControl.offButtonPush(4);
        System.out.println(remoteControl);
    }

}