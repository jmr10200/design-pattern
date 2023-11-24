# 3. 템플릿 메소드 패턴 (Template Method Pattern)
>메소드에서 알고리즘의 골격을 정의한다.
알고리즘의 여러 단계 중 일부는 서브클래스에서 구현할 수 있다.
템플릿 메소드를 이용하면 알고리즘의 구조는 그대로 유지하면서 서브클래스에서 특정 단계를 재정의할 수 있다.

>상위 클래스에서 처리의 뼈대를 결정하고 하위 클래스에서 그 추제적 내용을 결정하는 패턴


* 블로그 링크 : [클릭](https://gymdev.tistory.com/11)
* 블로그 관련 소스코드 : [클릭](https://github.com/jmr10200/design-pattern/tree/master/src/main/java/hello/example/designpattern/templatemethod)

<br>

### (1) 추상클래스(AbstractClass) : AbstractDisplay 클래스에서 추상 메소드를 사용하는 display() 메소드가 템플릿 메소드 이다.
```java
public abstract class AbstractDisplay {
    // open, print, close 는 하위 클래스에 구현을 맡기는 추상 메소드
    public abstract void open();
    public abstract void print();
    public abstract void close();

    // display 는 AbstractDisplay 에서 구현하는 메소드 -> 템플릿 메소드
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
```


| **예제코드**                                                                                                                                                                                               | **내용**                                     |
|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:-------------------------------------------|
| [AbstractDisplay 클래스 (클릭하여 소스보기)](../src/main/java/hello/example/designpattern/templatemethod/yuki/AbstractDisplay.java)                                                                               | 메소드 display() 만 구현한 추상 클래스                 |
| [CharDisplay 클래스 (클릭하여 소스보기)](../src/main/java/hello/example/designpattern/templatemethod/yuki/CharDisplay.java)                                                                                       | 메소드 open(), close(), print() 를 구현하는 하위 클래스 |
| [StringDisplay 클래스 (클릭하여 소스보기)](../src/main/java/hello/example/designpattern/templatemethod/yuki/StringDisplay.java)                                                                                   | 메소드 open(), close(), print() 를 구현하는 하위 클래스 |
| [DisplayTest 실행 클래스 (클릭하여 소스보기)](../src/test/java/hello/example/designpattern/templatemethod/yuki/DisplayTest.java)                                                                                    | 동작 테스트용 클래스                                |


### (2) 구현 클래스(ConcreateClass) : 템플릿 메소드인 display() 가 실제 무슨 일을 하는지는 하위 클래스에서 구현한다.
AbstractDisplay 클래스만 봐서는 open(), close(), print() 메소드가 추상 메소드이므로 dispaly() 가 무슨 일을 하는지는 알 수 없다. <br>
따라서 하위 클래스(CharDisplay, StringDisplay)에서 추상 메소드의 구현을 확인해야 한다.<br>

하위 클래스에서 오버라이드(@Override) 어노테이션으로 추상메소드를 구현한다.


```java
public class CharDisplay extends AbstractDisplay {
    private char ch; // 표시해야 하는 문자

    // constructor
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        // 시작 문자열 "<<" 표시
        System.out.print("<<");
    }

    @Override
    public void print() {
        // 필드에 저장해 둔 문자를 1회 표시
        System.out.print(ch);
    }

    @Override
    public void close() {
        // 종료 문자열 ">>" 표시
        System.out.println(">>");
    }
}
```


<hr>


## # 정리
### 1. 로직을 공통화 할 수 있다.
상위 클래스 (AbstractClass) 에 로직이 기술되어 있으므로 하위 클래스 (ConcreteClass) 에는 로직을 일일이 기술할 필요가 없다.<br>
이는 유지보수 관점에서 봐도 유용하다. 변경이나 오류가 발생했을때 템플릿 메소드만 수정하면 되기 때문이다.

### 2. 리스코프 치환 원칙 (The Liskov Substitution Principle, LSP)
[테스트용 실행 코드(클릭)](../src/test/java/hello/example/designpattern/templatemethod/yuki/DisplayTest.java)를 보면 CharDisplay, StringDisplay 인스턴스 모두 AbstractDisplay 형으로 생성하여 display() 메소드를 호출한다.<br>

AbstractDisplay 에 CharDisplay, StringDisplay 모두 대입하여 호출하고 있는 것처럼 상위 클래스형 변수에 하위 클래스 인스턴스 중 어느 것을 대입해도 동작할 수 있어야 한다.

```java
class DisplayTest {
    @Test
    void charDisplay() {
        // CharDisplay 인스턴스를 AbstractDisplay 으로 생성
        AbstractDisplay charDisplay = new CharDisplay('H');
        charDisplay.display(); // 실제 동작은 CharDisplay 클래스에서 결정
    }

    @Test
    void stringDisplay() {
        // StringDisplay 인스턴스를 AbstractDisplay 으로 생성
        AbstractDisplay stringDisplay = new StringDisplay("Hello, world");
        stringDisplay.display(); // 실제 동작은 StringDisplay 클래스에서 결정
    }
}
```
<br>

>리스코프 치환 원칙 (The Liskov Substitution Principle, LSP)
>>서브타입(subtype) 은 그것의 기반 타입(base type)으로 치환 가능해야 한다.

<br>

### 3. 추상 클래스의 의의
추상 클래스에 추상 메소드가 선언되어 있으면 다음을 의미하는 것이다.

* 하위 클래스에서 추상 메소드를 구현하기를 기대한다.
* 하위 클래스에서 해당 메소드 구현을 요청한다.

실제 처리 내용은 하위 클래스까지 가야 결정되지만, **추상 클래스 단계에서 처리 흐름을 형성하는 것이 중요**하다.

Template Method 패턴에서는 처리 내용의 뼈대는 상위 클래스에 기술하고, 구체적인 내용은 하위 클래스에 기술한다.<br>

상위 클래스에 많이 기술하면 하위 클래스 작성이 편하지만, 그만큼 하위 클래스에 제약이 많고 자유가 줄어든다.
반대로 상위 클래스에 적게 기술하면 하위 클래스에서 보다 많은 기술이 필요하며, 처리가 중복될 수도 있다.<br>

어떤 처리를 상위에 두고 하위에 둬야하는지는 정해져있지 않고 설계하는 사람의 몫이므로 적절한 판단이 요구된다.