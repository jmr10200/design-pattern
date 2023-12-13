package hello.example.designpattern.composite.files;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite
 */
public class Directory implements FileSystemItem {

    private String name;
    private List<FileSystemItem> items = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        items.add(item);
    }

    @Override
    public void display() {
        System.out.println("Directory: " + name);
        for (FileSystemItem item : items) {
            item.display();
        }
    }
}
