package hello.example.designpattern.proxy.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 프록시 패턴
 * 의도(intent) : 다른 개체에 대한 "접근을 제어"하기 위해 대리자(프록시)를 제공
 *
 * 참고 : 데코레이터 패턴과 유사하지만 "의도(intent)"에 따라 구분한다.
 */
class ProxyPatternTest {

    @Test
    void noProxyTest() {
        RealSubject realSubject = new RealSubject();
        ProxyPatternClient client = new ProxyPatternClient(realSubject);
        client.execute();
        client.execute();
        client.execute();
        // 각 호출마다 1초씩 소요된다.
        // 만약 모두 같은 데이터를 호출한다면? 캐시해두는 것이 성능상 좋다.
    }

    /**
     * RealSubject 코드와 client 코드를 변경하지 않고, 프록시 도입으로 접근 제어를 했다.
     * 클라이언트 코드의 변경 없이 프록시를 넣고 뺄 수 있다.
     * 실제 클라이언트 입장에서는 프록시 객체가 주입되었는지, 프록시가 주입되었는지 알 수 없다.
     */
    @Test
    void cacheProxyTest() {
        Subject realSubject = new RealSubject();
        Subject cacheProxy = new CacheProxy(realSubject);
        ProxyPatternClient client = new ProxyPatternClient(cacheProxy);
        client.execute();
        client.execute();
        client.execute();
        // 캐시된 값을 가져오므로 noProxyTest() 보다 성능성 더 좋다
    }

}