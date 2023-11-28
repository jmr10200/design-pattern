package hello.example.designpattern.prototype.yuki;

import hello.example.designpattern.prototype.yuki.framework.Product;

public class MessageBox implements Product {

    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String str) {
        int decolen = 1 + str.length() + 1;
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }

        System.out.println();
        System.out.println(decochar + str + decochar);

        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }

        System.out.println();
    }

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
