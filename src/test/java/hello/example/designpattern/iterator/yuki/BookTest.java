package hello.example.designpattern.iterator.yuki;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void main() {
//        BookShelf bookShelf = new BookShelf(4);
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("1.bible"));
        bookShelf.appendBook(new Book("2.design patterns"));
        bookShelf.appendBook(new Book("3.javascript basic"));
        bookShelf.appendBook(new Book("4.spring framework basic"));

        // 명시적으로 Iterator 를 사용하는 방법
        Iterator<Book> iter = bookShelf.iterator();
        while (iter.hasNext()) {
            Book book = iter.next();
            System.out.println(book.getName());
        }
        System.out.println("---");

        // 확장 for 문 사용하는 방법
        for (Book book : bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println("book size = " + bookShelf.getLength());
    }

}