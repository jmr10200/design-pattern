package hello.example.designpattern.facade.yuki;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

public class Database {
    private Database() {
    }

    // 데이터베이스 이름에서 Properties 취득
    public static Properties getProperties(String dbname) throws IOException {
        String fileName = dbname + ".txt";
        Properties prop = new Properties();
        String name = Database.class.getPackageName();

        String currentPath = Paths.get("").toAbsolutePath().toString();
        System.out.println(currentPath);
        prop.load(new FileReader(currentPath+"/src/main/java/hello/example/designpattern/facade/yuki/"+fileName));
        return prop;
    }
}
