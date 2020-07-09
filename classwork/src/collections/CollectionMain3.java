package collections;

import java.util.LinkedList;
import java.util.List;

public class CollectionMain3 {
    public static void main(String[] args) {

        List<String> data = new LinkedList<>();
        data.add("Привет");
        data.add("Как дела");
        data.add("Что делаешь");
        data.remove("Привет");

        System.out.println(data.get(0));
        System.out.println(data.get(1));
       // System.out.println(data.get(2));


    }
}
