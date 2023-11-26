package hello.example.designpattern.singleton.yuki;

public class TicketMaker {
    private int ticket = 1000;

    private static TicketMaker singleton = new TicketMaker();

    // constructor
    private TicketMaker() {
    }

    public static TicketMaker getInstance() {
        return singleton;
    }

    public synchronized int getNextTicketNumber() { // 멀티스레드환경 고려
        return ticket++;
    }
}
