package collections;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain6 {

    public static void main(String[] args) {

        List<String> data1 = new LinkedList<>();
        List<String> data2 = new ArrayList<>();

       data1.add("Привет");

        System.out.println(data1.get(0));
      //  System.out.println(data1.get(1));
        String old =  data1.set(0,"Пока");
        System.out.println(data1.get(0));
       // System.out.println(data1.get(1));
        System.out.println(old);
        String old2 = data1.set(10, "Пока");



    }

}
