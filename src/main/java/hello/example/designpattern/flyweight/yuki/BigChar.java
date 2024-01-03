package hello.example.designpattern.flyweight.yuki;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BigChar {
    // 문자 이름
    private char charName;

    // 큰 문자를 표현하는 문자열 ('#', '.', '\n' 으로 이루어진 열)
    private String fontData;

    // Constructor

    public BigChar(char charName) {
        this.charName = charName;
        try {
            String currentPath = Paths.get("").toAbsolutePath().toString();
            String fileName = "big" + charName + ".txt";
            String fileFullPath = currentPath + "/src/main/java/hello/example/designpattern/flyweight/yuki/txt/" + fileName;

            StringBuilder sb = new StringBuilder();
            for (String line : Files.readAllLines(Path.of(fileFullPath))) {
                sb.append(line);
                sb.append("\n");
            }
            this.fontData = sb.toString();
        } catch (IOException e) {
            this.fontData = charName + "?";
        }
    }

    // 큰 문자 표시
    public void print() {
        System.out.println(fontData);
    }
}
