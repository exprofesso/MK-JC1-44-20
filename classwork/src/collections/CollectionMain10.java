package collections;

import collections.sort.CompareHairLenghhinMan;
import collections.sort.CompareHairLengthAnNameinMan;
import collections.sort.CompareStringReverse;
import obj.core.Man;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class CollectionMain10 extends Man {

    public static void main(String[] args) {
        Set<Man> data = new TreeSet<>(new CompareHairLengthAnNameinMan());
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

        for (Man datum: data)
            System.out.println(datum);

        Iterator<Man> iterator = data.iterator();
        while (iterator.hasNext()){
            Man next = iterator.next();
            String  name = next.getName();
            int hairLergth =  next.getHairLergth();

            System.out.println(name);
            System.out.println(hairLergth);

        }



    }



}
