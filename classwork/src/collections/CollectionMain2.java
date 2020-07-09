package collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain2 {
    public static void main(String[] args) {

        List<List<List<List<List<List<String>>>>>> dat = new ArrayList<>();

        dat.add(new ArrayList<>());
        dat.get(0).get(0).add(new ArrayList<>());
        dat.get(0).get(0).get(0).add(new ArrayList<>());
        dat.get(0).get(0).get(0).get(0).add(new ArrayList<>());
        dat.get(0).get(0).get(0).get(0).get(0).add("Привет");
    }
}
