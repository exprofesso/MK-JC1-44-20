package exceptions;

public class ExceptionsMain3 {

    public static void main(String[] args) {
        try {
            System.out.println(method1(1));
            System.out.println(method1(51));
            System.out.println(method1(99));
            System.out.println(method1(-1));
        } catch (IllegalArgumentException | ArithmeticException e){
            System.out.println("Мы получили ошибку " + e.getMessage());
        }
        catch (Throwable e){
            System.out.println("Все очень плохо");
        }
    }

    public static int method1(int a){
        if (a < 51) {

            return method3(a);
        }
        return method2(a);
    }
    public static int method2(int a){
        if(a == 10){
            return method1(a);
        }
        return method3(a);
    }
    public static int method3(int a){
         if(a == 99){
            throw new RuntimeException("99 этого вообще не может быть ");
        }
        if(a > 50){
            throw new IllegalArgumentException("Числа не могут быть более 50");
        }
        return 1;
    }





}
