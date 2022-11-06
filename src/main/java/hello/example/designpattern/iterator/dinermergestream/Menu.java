package hello.example.designpattern.iterator.dinermergestream;

import java.util.Iterator;
import java.util.stream.Stream;

public interface Menu {
    public Iterator createIterator();
}
