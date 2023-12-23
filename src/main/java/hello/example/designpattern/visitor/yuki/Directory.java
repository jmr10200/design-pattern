package hello.example.designpattern.visitor.yuki;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Entry 하위 클래스
 */
public class Directory extends Entry implements Iterable<Entry> {
    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : directory) {
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    // Iterator<Entry> 리턴
    @Override
    public Iterator<Entry> iterator() {
        return directory.iterator();
    }

    @Override
    public void accept(Visitor v) {
        // Visitor 의 visit 메소드를 호출
        v.visit(this); // this 는 Directory 인스턴스
    }
}
