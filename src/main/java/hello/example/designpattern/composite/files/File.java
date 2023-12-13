package hello.example.designpattern.composite.files;

/**
 * Leaf
 */
public class File implements FileSystemItem {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("File: " + name);
    }
}
