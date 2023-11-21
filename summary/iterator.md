# 1. 이터레이터 패턴 (Iterator Pattern)
>컬렉션 구현 방법을 노출시키지 않으면서도 그 집합체 안에 들어있는 모든 항목에 접근할 수 있는 방법을 제공한다.

* 블로그 링크 : [클릭](https://gymdev.tistory.com/33)
* 블로그 관련 소스코드 : [클릭](https://github.com/jmr10200/design-pattern/tree/master/src/main/java/hello/example/designpattern/iterator)

<br>

### (1) Iterable\<E> 인터페이스
```java
public interface Iterable<E> {
    public abstract Iterator<E> iterator();
}
```
Iterable\<E> 인터페이스는 처리를 반복할 대상을 나타내는 것으로 구현하는 클래스는 배열, 리스트 등으로 '집합체'가 된다.


### (2) Iterator\<E> 인터페이스
```java
public interface Iterator<E> {
    public abstract boolean hasNext();
    public abstract E next();
}
```
Iterator\<E> 인터페이스는 하나하나의 요소 처리를 반복하기 위한 것이다.


<hr>


### (3) 사용법
[코드(클릭)](../src/test/java/hello/example/designpattern/iterator/yuki/BookTest.java)
#### 1) 명시적으로 Iterator 를 사용하는 방법
```java
while (iter.hasNext()){
    Book book = iter.next();
    System.out.println(book.getName());
}
```

#### 2) 확장 for문을 사용하는 방법
```java
for (Book book: BookShelf) {
    System.out.println(book.getName());
}
```
Iterable 인터페이스를 구현한 클래스의 인스턴스에 대해 내부적으로 Iterator 를 사용하여 처리한다.


<hr>


## # 정리
### 1. 어떻게 구현하든 Iterator 를 사용할 수 있다.
배열로 구현하던 것을 ArrayList로 변경하더라도 iterator 메소드를 가지고 Iterator\<book> 를 반환하면 아래의 while 루프는 변경하지 않아도 동작한다.
```java
while (iter.hasNext()){
    Book book = iter.next();
    System.out.println(book.getName());
}
```

### 2. 추상 클래스와 인터페이스를 사용하여 프로그래밍 한다.
구체적인 클래스로 프로그래밍하는 것이 아니라 Iterable 이나 Iterator\<E> 와 같은 인터페이스를 사용하여 프로그래밍 한다.

### 3. next() 와 hasNext() 는 혼동하기 쉬우니 주의해야 한다.
next() 는 '현재 요소를 반환하고 다음 위치로 진행하는 것'이며, hasNext() 는 마지막 요소를 얻은 후에는 false 를 반환하므로 '다음에 next() 메소드를 호출해도 괜찮은지 확인하는 메소드'이다.

