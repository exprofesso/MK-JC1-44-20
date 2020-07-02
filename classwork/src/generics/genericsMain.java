package generics;

import obj.core.Calculator;

public class genericsMain {
    public static void main(String[] args) {
        BoxObject box1 = new BoxObject();


        box1.setItem("hi");
        box1.setItem(123);
        box1.setItem(new Calculator());

        System.out.println(getDate(box1,1, 2));




    }

    public static double getDate(BoxObject box, int a, int b){
        Calculator calc = (Calculator) box.getItem();
        return calc.plus(a, b);
    }

}
