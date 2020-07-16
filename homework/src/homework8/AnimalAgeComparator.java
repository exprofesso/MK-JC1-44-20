package homework8;
import java.util.Comparator;

/*

7. Создать класс AnimalAgeComparator который наследует интерфейс Comparator из jdk. Данный класс должен сравнивать возраст животных.

 */


public class AnimalAgeComparator implements Comparator<Animal> {


    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAge() - o2.getAge();
    }
}
