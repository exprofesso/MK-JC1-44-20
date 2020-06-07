package homework2;

import java.util.Scanner;

public class taskmain1 {
    public static void main(String[] args) {

for (int i = 1; i <= 10; i++){
    for (int j = 1; j <= 10; j++) {

        System.out.print(i * j + " \t");
    }
    System.out.println(" ");
}
        System.out.println(" \t");
        System.out.println(" \t");
        for (int i = 2; i < 10; i++){
            for (int j = 1; j < 10; j++) {

                System.out.print(i + " * " + j + " = " + i * j + " \t");

            }
            System.out.println(" ");
        }



        System.out.println(" \t");
        System.out.println(" \t");
        System.out.println("Укажите число до которого хотите создать таблицу умножения\n");

        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

       for (int i = 1; i <= answer; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " \t");
            }
            System.out.println(" ");
        }
       int answercash = answer;
        System.out.println(" \t");
        System.out.println(" \t");
        int sumanswer = 1;
        while (answer > 0) {
             int lastDigit = answer % 10;
            sumanswer *= lastDigit;
            answer /= 10;
        }
        System.out.println("Если перемножить цифры числа " + answercash + " получаем результат " + sumanswer);




    }
}
