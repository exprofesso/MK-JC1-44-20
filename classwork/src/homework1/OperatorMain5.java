package homework1;

public class OperatorMain5 {
    public static void main(String[] args) {
        boolean a = print(1) && print(2);
        boolean b = print(3) & print(4);
        boolean c = print(5) || print(6);
        boolean d = print(7) | print(8);
        print(9);

    }
    public static boolean print (int a){
        System.out.println("print " + a);
        return true;
    }

}