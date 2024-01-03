package hello.example.designpattern.proxy.cache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImageProxyTest {

    @Test
    void main() {
        // 캐싱 프록시를 사용하여 이미지 로딩
        Image image = new CachingProxyImage("example.jpg");

        // 이미지 표시 : 캐시되어 있지 않아서 이미지 로딩 발생
        image.display();

        // 이미지가 캐시되어 있으므로 다시 표시해도 이미지 로딩 발생하지 않음
        image.display();

        // 세번째 같은 이미지 표시하면 캐시되어 있으므로 이미지 로딩 발생 X
        image.display();
    }

}