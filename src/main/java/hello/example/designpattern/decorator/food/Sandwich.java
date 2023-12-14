package hello.example.designpattern.decorator.food;

/**
 * Component
 *
 * 샌드위치를 나타내는 컴포넌트 인터페이스
 */
public interface Sandwich {
    String getDescription();

    int cost();
}
