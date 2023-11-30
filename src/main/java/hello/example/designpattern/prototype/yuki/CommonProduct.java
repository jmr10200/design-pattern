package hello.example.designpattern.prototype.yuki;

import hello.example.designpattern.prototype.yuki.framework.Product;

/**
 * createCopy() 메소드의 구현이 중복되면 공통 상위 클래스를 만들어 해당 메소드를 구현하고
 * 중복되지않는 메소드 use() 는 하위 클래스에서 공통 상위 클래스를 상속받아 구현하도록 할 수 있다.
 *
 * extends CommonProduct
 * @Override
 * use()
 */
public class CommonProduct implements Product {

    @Override
    public void use(String str) {
        // 중복되지 않는 메소드는 CommonProduct 를 상속하는 하위 클래스에서 오버라이드
    }

    // 중복되는 내용의 메소드는 공통 상위 클래스를 만들어 중복을 줄일 수 있다.
    @Override
    public Product createCopy() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
