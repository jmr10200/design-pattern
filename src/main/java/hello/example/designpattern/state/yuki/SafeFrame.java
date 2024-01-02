package hello.example.designpattern.state.yuki;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {

    // 현재시간 표시
    private TextField textClock = new TextField(60);

    // 경비센터 출력
    private TextArea textScreen = new TextArea(10, 60);

    // 금고사용 버튼
    private Button buttonUse = new Button("금고 사용");

    // 비상벨 버튼
    private Button buttonAlarm = new Button("비상벨");

    // 일반통화 버튼
    private Button buttonPhone = new Button("일반 통화");

    // 종료 버튼
    private Button buttonExit = new Button("종료");

    // 현재상태
    private State state = DayState.getInstance();

    // constructor

    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        // textClock 배치
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        // textScreen 배치
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);
        // 패널에 버튼 저장
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        // 패널 배치
        add(panel, BorderLayout.SOUTH);
        // 표시
        pack();
        setVisible(true);
        // 리스너 설정
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    // 버튼 클릭시
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if (e.getSource() == buttonUse) {
            // 금고사용 버튼
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm) {
            // 비상벨 버튼
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {
            // 일반통화 버튼
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {
            // 종료 버튼
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }

    // 시간 설정
    @Override
    public void setClock(int hour) {
        String clockString = String.format("현재 시간은 %02d:00", hour);
        System.out.println(clockString);
        textClock.setText(clockString);
        state.doClock(this, hour);
    }

    // 상태전환
    @Override
    public void changeState(State state) {
        System.out.println(this.state + " 에서 " + state + " 으로 상태가 변화했습니다.");
        this.state = state;
    }

    // 경비센터 경비원 호출
    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call! " + msg + "\n");
    }

    // 경비센터 기록
    @Override
    public void recordLog(String msg) {
        textScreen.append("record ... " + msg + "\n");
    }
}
