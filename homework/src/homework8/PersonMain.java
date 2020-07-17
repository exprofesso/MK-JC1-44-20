package homework8;


import java.util.Iterator;
import java.util.LinkedList;

/*
4. При помощи рандома генерируем 1_000_000 объектов Person. LinkedList. Если компьютер глючит сделать 100_000
8. Отсортировать списки при помощи созданный компараторов
9. Замерить скорость наполнения LinkedList и ArrayList. Скорость наполнения - это разница между количеством миллисекунд между началом вставки в список первого элемента, и количеством миллесукунд после конца вставки последного элемента. В комментарии написать количество миллисекунд. Для получения текущего количества миллесекунд использовать метод из jdk System.currentTimeMillis().
10. Удалить все элементы из списка Person при помощи iterator
12. Замерить скорость удаления LinkedList и ArrayList. В комментарии написать количество миллисекунд.


 */
public class PersonMain {

    public static void main(String[] args) {

        PersonMain linked = new PersonMain();
        PersolalLinkedList();





    }

    public static void PersolalLinkedList (){

        PersonPassLengthComparator comparator = new PersonPassLengthComparator();
        LinkedList<Person> Person = new LinkedList();


        long lStartTime = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++ ) {
            Person.add(new Person(RandomString.StringRandom(6), RandomString.StringRandom(6)));

        }
        Person.sort(comparator);

        long lEndTime = System.nanoTime();


        long output = lEndTime - lStartTime;

        System.out.println("Elapsed time in milliseconds: " + output/1000000); // Elapsed time in milliseconds: 2963


        lStartTime = System.nanoTime();
        Iterator<Person> iterator = Person.iterator();
        while (iterator.hasNext()){
            Person.remove(0);
        }
        lEndTime = System.nanoTime();

        output = lEndTime - lStartTime;

        System.out.println("Elapsed time in milliseconds: " + output/1000000);  //Elapsed time in milliseconds: 35


    }



}
