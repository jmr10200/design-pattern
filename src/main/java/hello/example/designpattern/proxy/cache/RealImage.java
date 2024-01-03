package hello.example.designpattern.proxy.cache;

/**
 * RealSubject
 */
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("디스크로부터 이미지 로딩: " + filename);
    }

    @Override
    public void display() {
        System.out.println("이미지 표시: " + filename);
    }
}
