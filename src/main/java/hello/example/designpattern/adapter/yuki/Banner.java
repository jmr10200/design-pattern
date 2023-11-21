package hello.example.designpattern.adapter.yuki;

public class Banner {

    private String copy;

    public Banner(String copy) {
        this.copy = copy;
    }

    public void showWithParen() {
        System.out.println("(" + copy + ")");
    }

    public void showWithAster() {
        System.out.println("*" + copy + "*");
    }

}
