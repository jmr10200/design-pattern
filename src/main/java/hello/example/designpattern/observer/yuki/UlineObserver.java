package hello.example.designpattern.observer.yuki;

public class UlineObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("UlineObserver: ");
        int count = generator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("_");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}