package obj;

import obj.core.Calculator;
import obj.core.CalculatorExtends;

public class ObjectMain6 {
    public static void main(String[] args) {

        Calculator calcl = new Calculator();
        CalculatorExtends calcl2 = new CalculatorExtends();

        System.out.println(calcl.power(2, 5));
        System.out.println(calcl2.power(2, 5));
        System.out.println(calcl.plus(1, 5));
        System.out.println(calcl2.plus(1, 5));
      //  System.out.println(calcl1.sqrl(5));
        System.out.println(calcl2.sqrl(5));
        System.out.println(calcl2.sqrl(44));



    }
}
