package hello.example.designpattern.iterator.dinermergestream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IteratorJavaTest {
    Clerk clerk;
    @BeforeEach
    void beforeEach() {
        SteakMenu steakMenu = new SteakMenu();
        BurgerMenu burgerMenu = new BurgerMenu();
        clerk = new Clerk(steakMenu, burgerMenu);

    }

    @Test
    @DisplayName("전체메뉴 출력 by iterator")
    void printMenu() {

        // 전체 메뉴출력
        System.out.println("***** 전체 메뉴 출력 *****");
        clerk.printMenu();
    }

    @Test
    @DisplayName("채식 메뉴 출력 by iterator")
    void printVegetarian() {
        // 채식메뉴 출력
        System.out.println("***** 채식 메뉴 출력 *****");
        clerk.printVegetarianMenu();
    }

    @Test
    @DisplayName("베지테리언 메뉴 확인 by iterator")
    void confirmVegetarian() {

        // case1 : 없는 메뉴
        String notMenu = "없는메뉴";
        Assertions.assertThat(clerk.isItemVegetarian(notMenu)).isFalse();

        // case2 : 스테이크메뉴 - 콩고기 스테이크
        String beanSteak = "콩고기 스테이크";
        Assertions.assertThat(clerk.isItemVegetarian(beanSteak)).isTrue();

        // case3 : 버거메뉴 - 야채버거
        String vegeBurger = "야채버거";
        Assertions.assertThat(clerk.isItemVegetarian(vegeBurger)).isTrue();
    }

}