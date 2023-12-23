package hello.example.designpattern.visitor.animal;

import java.util.ArrayList;
import java.util.List;

/**
 * ObjectStructure (객체 구조) : 동물 목록
 */
public class AnimalStructure {
    private List<Animal> animalList = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public void performOperation(AnimalVisitor visitor) {
        for (Animal a : animalList) {
            a.accept(visitor);
        }
    }
}
