package hello.example.designpattern.singleton.yuki;

public class TicketMaker {
    private int ticket = 1000;

    public int getNextTicketNumber() {
        return ticket++;
    }
}
