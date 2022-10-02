package hello.example.designpattern.templatemethod;

public abstract class CaffeineBeverage {
    /**
     * 템플릿 화
     */
    final void prepareRecipe() {
        boilWater();	  // 1. 물을 끓인다.
        brew();		      // 2. 끓는 물에 우려낸다.
        pourInCup(); 	  // 3. 컵에 따른다.
        addCondiments();  // 4. 향신료를 첨가한다.

        // hook
        if (customerWantsExtra) {
            addExtra();
        }
        release(); // 제공
    }

    /**
     * 변하는 부분 : 각 클래스에서 재정의한다.
     */
    abstract void brew();

    /**
     * 변하는 부분 : 각 클래스에서 재정의한다.
     */
    abstract void addCondiments();

    /**
     * 변하지 않는 부분 : 공통처리
     */
    void boilWater() {
        System.out.println("물을 끓인다.");
    }

    /**
     * 변하지 않는 부분 : 공통처리
     */
    void pourInCup() {
        System.out.println("컵에 따른다.");
    }

    void release() {
        System.out.println("===== 서빙완료 =====");
    }

    /**
     * hook
     */
    boolean customerWantsExtra;

    public boolean isCustomerWantsExtra() {
        return customerWantsExtra;
    }

    public void setCustomerWantsExtra(boolean customerWantsExtra) {
        this.customerWantsExtra = customerWantsExtra;
    }

    abstract void addExtra();
}
