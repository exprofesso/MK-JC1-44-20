package obj;

import obj.core.Animal;

public class ObjectMain4 {
    public static void main(String[] args) {

        Animal dog = new Animal("Дворовая");
        Animal cat = new Animal("Британец");

        System.out.println(dog.getPoroda());
        System.out.println(cat.getPoroda());
        System.out.println(cat.quantity());
        System.out.println(dog.quantity());
        System.out.println(Animal.quantity());
        System.out.println(dog.breed("Дворняга "));
        System.out.println(Animal.populate());
        System.out.println(dog.getPoroda());




    }
}
