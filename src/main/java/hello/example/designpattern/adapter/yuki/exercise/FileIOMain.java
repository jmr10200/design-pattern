package hello.example.designpattern.adapter.yuki.exercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class FileIOMain {
    public static void main(String[] args) {
        FileIO file = new FileProperties();

        try {
            String currentPath = Paths.get("").toAbsolutePath().toString();
            file.readFromFile(currentPath + "/src/main/java/hello/example/designpattern/adapter/yuki/exercise/files/file.txt");
            file.setValue("width", "1024");
            file.setValue("height", "512");
            file.setValue("depth", "32");
            file.writeToFile(currentPath + "/src/main/java/hello/example/designpattern/adapter/yuki/exercise/files/newfile.txt");
            System.out.println("newfile.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
