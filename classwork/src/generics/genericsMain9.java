package generics;

public class genericsMain9 {
    public static void main(String[] args) {

        BoxGenericsNumber<Integer> box1 = new BoxGenericsNumber();
        BoxGenericsNumber<Long> box2 = new BoxGenericsNumber();
        BoxGenericsNumber<Double> box3 = new BoxGenericsNumber<>();
        BoxGenericsNumber<Number> box4 = new BoxGenericsNumber<>();


        Object a = 10;
        Long b = 10L;
        System.out.println(a instanceof Long);
        System.out.println(box1 instanceof  BoxGenericsNumber);

        Class cls1 = box1.getClass();
        Class cls2 = box2.getClass();
        System.out.println(cls1 == cls2);

        BoxGenericsNumber.print(box1);
        BoxGenericsNumber.print(box2);

        BoxGenericsNumber.printInt(box1);
     //   BoxGenericsNumber.printInt(box2);

     //     BoxGenericsNumber.printDouble(box1);
     //     BoxGenericsNumber.printDouble(box2);
            BoxGenericsNumber.printDouble(box3);
            BoxGenericsNumber.printDouble(box4);





    }

}
