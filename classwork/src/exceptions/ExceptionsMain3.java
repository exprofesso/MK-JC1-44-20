package exceptions;

public class ExceptionsMain3 {
    public static void main(String[] args) {
        try {
            System.out.println(method1(1));
        } catch (IllegalArgumentException e){
            System.out.println("Мы получили ошибку: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Мы получили ошибку: " + e.getMessage());
        } catch (Throwable e){
            System.out.println("Всё очень плохо");
        }
        try {
            System.out.println(method1(51));
        } catch (IllegalArgumentException e){
            System.out.println("Мы получили ошибку: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Мы получили ошибку: " + e.getMessage());
        } catch (Throwable e){
            System.out.println("Всё очень плохо");
        }
        try {
            System.out.println(method1(99));
        } catch (IllegalArgumentException e){
            System.out.println("Мы получили ошибку: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Мы получили ошибку: " + e.getMessage());
        } catch (Throwable e){
            System.out.println("Всё очень плохо");
        }
        try {
            System.out.println(method1(-1));
        } catch (IllegalArgumentException e){
            System.out.println("Мы получили ошибку: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Мы получили ошибку: " + e.getMessage());
        } catch (Throwable e){
            System.out.println("Всё очень плохо");
        }

    }

    public static int method1(int a){
        if(a < 51){
            return method3(a);
        } else {
            return method2(a);
        }
    }

    public static int method2(int a){
        if(a == 10){
            return method1(a);
        } else {
            return method3(a);
        }
    }

    public static int method3(int a){
        if(a > 50){
            throw new IllegalArgumentException("Числа не могут быть более 50");
        }
        return 1;
    }
}
