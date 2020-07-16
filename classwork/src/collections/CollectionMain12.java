package collections;

import collections.sort.CompareHairLengthAnNameinMan;
import obj.core.Man;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class CollectionMain12 extends Man {

    public static void main(String[] args) {
        Set<Man> data = new TreeSet<>(new CompareHairLengthAnNameinMan());
        try {
        data.add(new Man("илья", 10));
        data.add(new Man("илья", 16));
        data.add(new Man("илья", 2));
        data.add(new Man("наташа", 32));
        data.add(new Man("иван", 18));
        data.add(new Man("аврам", 30));
        data.add(new Man("руслан", 80));
        data.add(new Man("рагнеда", 9));
        data.add(new Man("алекс", 12));
        data.add(new Man("юра", 15));
    } catch (Throwable t4){
            System.out.println("Беда");
        }


        for (Man datum: data)
            System.out.println(datum);

        Iterator<Man> iterator = data.iterator();
        Man item1 = iterator.next();
        data.add(new Man("антон", 55));
        try {
            Man item2 = iterator.next();
        } catch (Throwable t){
            System.out.println("У нас ошибка");
            try {
                Man item2 = iterator.next();
            } catch (Throwable t1){
                System.out.println("что то иное");

            }
        }




    }



}
