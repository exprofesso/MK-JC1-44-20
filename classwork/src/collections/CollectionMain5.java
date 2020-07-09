package collections;
import obj.core.Man;

import java.util.LinkedList;
import java.util.List;

public class CollectionMain5 {
    public static void main(String[] args) {
        List<Man> data = new LinkedList<>();
        data.add(new Man("Илья", 10));
        data.add(new Man("Наташа", 10));
        data.add(new Man("Иван", 10));
        data.add(new Man("Аврам", 10));
        data.add(new Man("Руслан", 10));
        data.add(new Man("Рагнеда", 10));
        data.add(new Man("Алекс", 10));
        data.add(new Man("Юра", 10));


        System.out.println(data);
        data.remove(new Man("Илья", 10));
        System.out.println(data);
        data.remove(0);
        System.out.println(data);



    }


}
