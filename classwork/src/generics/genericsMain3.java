package generics;

import obj.core.Calculator;

public class genericsMain3 {
    public static void main(String[] args) {
        BoxGenerics<String> box1 = new BoxGenerics<>();

        box1.setIter("HI");


        BoxGenerics<Integer>  box2 = new BoxGenerics<>();

        box2.setIter(123);

        BoxGenerics<Calculator>  box3 = new BoxGenerics<>();

        BoxGenerics box4 = new BoxGenerics();

        String item1 = box1.getIter();
        Integer item2 = box2.getIter();
        Calculator item3 = box3.getIter();
        box4.setIter("привет");
        box4.setIter(123);
        box4.setIter(new Calculator());



        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);

    }
}
