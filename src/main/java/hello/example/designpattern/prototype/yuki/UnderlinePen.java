package hello.example.designpattern.prototype.yuki;

import hello.example.designpattern.prototype.yuki.framework.Product;

public class UnderlinePen implements Product {

    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    // 복사 생성자: 같은 클래스의 인스턴스를 인수로 가지고 인스턴스 생성 시 필드를 복사하는 생성자
    public UnderlinePen(UnderlinePen underlinePen) {
        this.ulchar = underlinePen.ulchar;
    }

    @Override
    public void use(String str) {
        int ulen = str.length();
        System.out.println(str);
        for (int i = 0; i < ulen; i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

//    @Override
//    public Product createCopy() {
//        Product product = null;
//        try {
//            product = (Product) clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return product;
//    }

    // 복사 생성자 이용
    @Override
    public Product createCopy() {
        return new UnderlinePen(this);
    }
}
