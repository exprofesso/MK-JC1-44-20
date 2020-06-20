package obj;

import obj.core.ManWithConstructor;
import obj.core.ManWithConstructorAndSetter;

public class ObjectMain2 {
    public static void main(String[] args) {

        ManWithConstructor man1 = new ManWithConstructor("Iliy");
        ManWithConstructor man2 = new ManWithConstructor();
        ManWithConstructorAndSetter man3 = new ManWithConstructorAndSetter();
        man3.setName("Вася");
        System.out.println(man1.getName());
        System.out.println(man1.getHairLergth());
        System.out.println(man2.getName());
        System.out.println(man2.getHairLergth());
        System.out.println(man3.getName());
        System.out.println(man3.getHairLergth());


    }
}
