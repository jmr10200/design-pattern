package hello.example.designpattern.proxy.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealSubject implements Subject {

    @Override
    public String operation() {
        log.info("실제 객체 호출");
        // 데이터 조회를 시뮬레이션 하기위해 1초 쉬도록 한다.
        sleep(1000); // DB 조회에 1초 걸린다는 가정
        return "data";
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
