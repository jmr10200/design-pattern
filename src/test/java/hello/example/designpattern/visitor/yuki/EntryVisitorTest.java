package hello.example.designpattern.visitor.yuki;
import org.junit.jupiter.api.Test;

class EntryVisitorTest {

    @Test
    void main() {
        System.out.println("== Making root entries ... ==");
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");
        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);

        binDir.add(new File("vi", 10000));
        binDir.add(new File("latex", 20000));

        rootDir.accept(new ListVisitor());
        System.out.println();

        System.out.println("== Making user entries... ==");
        Directory numDir = new Directory("num");
        Directory codeDir = new Directory("code");
        Directory booksDir = new Directory("books");
        usrDir.add(numDir);
        usrDir.add(codeDir);
        usrDir.add(booksDir);

        numDir.add(new File("diary.html", 100));
        numDir.add(new File("composite.java", 200));

        codeDir.add(new File("memo.tex", 300));

        booksDir.add(new File("game.doc", 400));
        booksDir.add(new File("info.mail", 500));

        rootDir.accept(new ListVisitor());
    }

}