package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain1 {
    public static void main(String[] args) {

        List<String> data1 = new LinkedList<>();
        List<String> data2 = new ArrayList<>();

       data1.add("Привет");

        System.out.println(data1.get(0));
      //  System.out.println(data1.get(1));
        data1.add(0,"Пока");
        System.out.println(data1.get(0));
        System.out.println(data1.get(1));

    }

}
