package hello.example.designpattern.composite.yuki;

public abstract class Entry {
    // 이름 취득
    public abstract String getName();

    // 크기 취득
    public abstract int getSize();

    // 리스트 표시
    public void printList() {
        printList("");
    }

    // prefix 앞에 붙여 목록 표시
    protected abstract void printList(String prefix);

    // 문자열 표시
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
