package hello.example.designpattern.iterator.yuki;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {

//    private Book[] books;
    private List<Book> books;

//    private int last = 0;

//    public BookShelf(int maxSize) {
//        this.books = new Book[maxSize];
//    }

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    public Book getBookAt(int index) {
//        return books[index];
        return books.get(index);
    }

    public void appendBook(Book book) {
//        this.books[last] = book;
//        last++;
        this.books.add(book);
    }

    public int getLength() {
//        return last;
        return this.books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
