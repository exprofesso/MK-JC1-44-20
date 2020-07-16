package collections;

import collections.sort.CompareStringReverse;

import java.util.Set;
import java.util.TreeSet;

public class CollectionMain8 {
    public static void main(String[] args) {
        Set<String> data = new TreeSet<> (new CompareStringReverse().reversed());


        data.add("a");
        data.add("A");
        data.add("b");
        data.add("v");
        data.add("V");
        data.add("i");
        data.add("r");

        System.out.println(data);

    }
}
