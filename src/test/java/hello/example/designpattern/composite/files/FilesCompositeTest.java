package hello.example.designpattern.composite.files;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilesCompositeTest {

    @Test
    void main() {
        File file1 = new File("file-1.txt");
        File file2 = new File("file-2.txt");

        Directory dir1 = new Directory("Folder_1");
        dir1.add(file1);
        dir1.add(file2);

        File file3 = new File("file-3.txt");
        File file4 = new File("file-4.txt");

        Directory dir2 = new Directory("Folder_2");
        dir2.add(file3);
        dir2.add(file4);

        Directory rootDir = new Directory("root");
        rootDir.add(dir1);
        rootDir.add(dir2);

        // 모든 파일 및 디렉토리 출력
        rootDir.display();
    }

}