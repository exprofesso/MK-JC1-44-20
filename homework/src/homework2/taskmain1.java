package homework2;

import java.util.Scanner;

public class taskmain1 {
    public static void main(String[] args) {

        // 1.1

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {

                System.out.print(i * j + " \t");
            }
            System.out.println(" ");
        }
        System.out.println(" \t");
        System.out.println(" \t");
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {

                System.out.print(i + " * " + j + " = " + i * j + " \t");

            }
            System.out.println(" ");
        }


// 1.2
        System.out.println(" \t");
        System.out.println(" \t");


        System.out.println("Введитье число от 1 до 12\n");
        Scanner scanner = new Scanner(System.in);
        int inquiry = scanner.nextInt();
        if(inquiry > 1 && inquiry < 13){
            System.out.println("Результат перемножения цифры числа " + inquiry + " получим " + multiply(inquiry));
        } else {
            System.out.println("Введите правильное число");
        }


        // 1.3

        int answercash = multiply(inquiry);
        System.out.println(" \t");
        System.out.println(" \t");
        int sumanswer = 1;
        while (answercash > 0) {
            int lastDigit = answercash % 10;
            sumanswer *= lastDigit;
            answercash /= 10;
        }
        System.out.println("Если перемножить цифр числа " + multiply(inquiry) + " получаем результат " + sumanswer);


    }
    public static int multiply (int a) {
        int rezult = 1;
            for (int i = 1; i <= a; i++) {
                rezult = rezult * i;
            }
        return rezult;

    }









}
