package exceptions;

public class ExceptionsMain10 {
    public static void main(String[] args) {
        try {
            System.err.println(method1(1));
            System.err.println(method1(51));
            System.err.println(method1(99));
            System.err.println(method1(-1));
        } catch (RuntimeException e){
            System.out.println("У нас рантайм");
            e.printStackTrace();
        } catch (IllegalAccessException e){
            System.out.println("Аксес эксепшен");
        }
    }

    public static int method1(int a) throws IllegalAccessException{
        if(a < 51){
            return method3(a);
        } else {
            return method2(a);
        }
    }

    public static int method2(int a) {
        try {
            if(a == 10){
                return method1(a);
            } else {
                return method3(a);
            }
        } catch (IllegalAccessException e){
            System.out.println("У нас ошибка");
            throw new RuntimeException(e);
        }
    }

    public static int method3(int a) throws IllegalAccessException{
        if(a > 50){
            throw new IllegalAccessException("Числа не могут быть более 50");
        }
        return 1;
    }
}
