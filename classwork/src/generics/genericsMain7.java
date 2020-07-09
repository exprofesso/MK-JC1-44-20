package generics;

public class genericsMain7 {
    public static void main(String[] args) {

        BoxGenericsNumber<Double> box1 = new BoxGenericsNumber<>();
        BoxGenericsNumber<Number> box2 = new BoxGenericsNumber<>();
        BoxGenericsNumber<Long> box3 = new BoxGenericsNumber<>();


        box1.setIter(500.);
        System.out.println("Первый вариант (Double) " + box1.add(10.0));
        box2.setIter(500);
        System.out.println("Второй вариант (Number) " + box2.add(10.0));
        box3.setIter(500L);
        System.out.println("Третий вариант (Long) " + box3.add(10L));
      //  Number val = box3.getIter();
        Long val = ((Number) box3.getIter()).longValue();
        System.out.println(val);
        box3.setIter(500L);
        System.out.println("Третий вариант (Long) " + box2.add(10));


    }

}
