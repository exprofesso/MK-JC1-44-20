package homework1;

import java.util.Scanner;

public class OperatorMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println("Ваш резутат " + c);
    }
}
