package homework8;

import java.util.ArrayList;
import java.util.Random;

/*
5. При помощи рандома генерируем 1_000_000 объектов Animal. ArrayList. Если компьютер глючит сделать 100_000
8. Отсортировать списки при помощи созданный компараторов
9. Замерить скорость наполнения LinkedList и ArrayList. Скорость наполнения - это разница между количеством миллисекунд между началом вставки в список первого элемента, и количеством миллесукунд после конца вставки последного элемента. В комментарии написать количество миллисекунд. Для получения текущего количества миллесекунд использовать метод из jdk System.currentTimeMillis().
11. Удалить все элементы из списка Animal при помощи любого из циклов.
12. Замерить скорость удаления LinkedList и ArrayList. В комментарии написать количество миллисекунд.

 */
public class AnimalMain {
    public static void main(String[] args) {

        AnimalMain array = new AnimalMain();
        array.AminalArrayList();


    }

    public static void AminalArrayList (){
        AnimalAgeComparator comparator = new AnimalAgeComparator();
        Random random = new Random();
        long lStartTime = System.nanoTime();
        ArrayList<Animal> animals = new ArrayList<>();

        for(int i = 0; i < 1_000_000; i++){
            int age = random.nextInt(100);
            animals.add(new Animal(age, RandomString.StringRandom(8)));
        }

        animals.sort(comparator);

        long lEndTime = System.nanoTime();

        long output = lEndTime - lStartTime;

        System.out.println("Elapsed time in milliseconds: " + output/1000000);   //Elapsed time in milliseconds: 440

        lStartTime = System.nanoTime();

        for(int i = 999_999; i > 0; i--) {
            animals.remove(i);
        }

        lEndTime = System.nanoTime();

        output = lEndTime - lStartTime;

        System.out.println("Elapsed time in milliseconds: " + output/1000000); // Elapsed time in milliseconds: 8






    }





}
