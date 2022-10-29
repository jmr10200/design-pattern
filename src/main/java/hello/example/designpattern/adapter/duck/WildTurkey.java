package hello.example.designpattern.adapter.duck;

public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("칠면조 꽥~");
    }

    public void fly() {
        System.out.println("칠면조는 짧은 거리만 날 수 있어요");
    }
}