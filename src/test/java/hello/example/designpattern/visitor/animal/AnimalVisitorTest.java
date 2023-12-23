package hello.example.designpattern.visitor.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalVisitorTest {

    @Test
    void main() {
        AnimalStructure animalStructure = new AnimalStructure();
        animalStructure.addAnimal(new Dog());
        animalStructure.addAnimal(new Cat());
        animalStructure.addAnimal(new Panda());

        // 방문자를 생성하고
        SoundVisitor soundVisitor = new SoundVisitor();
        // 객체구조에 적용
        animalStructure.performOperation(soundVisitor);
    }

}