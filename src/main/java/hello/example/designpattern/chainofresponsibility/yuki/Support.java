package hello.example.designpattern.chainofresponsibility.yuki;

public abstract class Support {

    // 트러블 담당자
    private String name;
    // 떠넘길 곳
    private Support next;

    public Support(String name) {
        this.name = name;
        this.next = null;
    }

    // 떠넘길 곳 설정
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    // 트러블 해결 절차 결정
    public void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    // toString
    @Override
    public String toString() {
        return "Support [ " + "name='" + name + "' ]";
    }

    // 해결하려고 시도
    protected abstract boolean resolve(Trouble trouble);

    // 해결 O
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    // 해결 X
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}
