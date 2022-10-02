package hello.example.designpattern.decorator.baverageno;

/**
 * Beverage 추상 클래스
 */
public abstract class BeverageNo {

    String description = "무슨 음료";
    boolean milk;
    boolean soy;
    boolean whip;
    boolean mocha;

    // getter
    public String getDescription() {
        return description;
    }

    /** 추상 메소드 : 가격은 각 음료 클래스에서 결정 */
    public abstract Integer cost();

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean isWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }
}
