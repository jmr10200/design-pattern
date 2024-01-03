package hello.example.designpattern.proxy.cache;

/**
 * Caching 와Proxy
 */
public class CachingProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public CachingProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            // 캐시에 이미지가 없으면 생성하고 캐시에 저장
            realImage = new RealImage(fileName);
        }
        // 캐시에 이미지가 있으면 캐시에서 이미지를 가져와서 표시
        realImage.display();
    }

}
