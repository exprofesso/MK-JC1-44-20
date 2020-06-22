package Operator;

public class OperatorMain7 {
    public static void main(String[] args) {


        int a = 10;
        int b = a++ + ++a;
        System.out.println(b);
        a = a++ + ++a;
        System.out.println(a);
        a = a++ + ++a + a++;
        System.out.println(a);


    }
}
