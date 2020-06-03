package workbook;

import java.util.Scanner;

public class TaskMain6 {

    public static void main(String[] args) {


        int day;
        int mount;
        int year;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите день числом");
            day = scanner.nextInt();

            while (day < 1 || day > 31) {
                System.out.println("Введите корректное число");
                day = scanner.nextInt();
            }
            System.out.println("Введите месяц числом");
            mount = scanner.nextInt();

            if (mount > 12 || mount < 1) {
                System.out.println("Введите корректный месяц");
                mount = scanner.nextInt();

            } while ((day == 31) && (mount == 4 || mount == 6 || mount == 9 || mount == 11)) {
                System.out.println("В этом месяце нет 31 числа, введите другое число");
                day = scanner.nextInt();
            } while ((day == 29 || day == 30 || day == 31) && (mount == 2)) {
                System.out.println("В феврале 28 дней");
                day = scanner.nextInt();
            }
            System.out.println("Введите какой вам нужен год");
            year = scanner.nextInt();

            System.out.println(day + " день " + mount + " месяца "+ year + " года");



            System.out.println("Теперь добавляем еще один день");

            if ((day == 31) && (mount == 1 || mount == 2 || mount == 3 || mount == 5 || mount == 7 || mount == 8 || mount == 10)){

                day = 1;
                mount++;
                System.out.println("Завтра будет " + day + " день " + mount + " месяца " + year +" года");
            } else if ((day == 31) && (mount == 12)){

                day = 1;
                mount = 1;
                year++;
                System.out.println("Завтра будет " + day + " день " + mount + " месяца " + year +" года");

            }else if ((day == 30) && (mount == 4 || mount == 6 || mount == 9 || mount == 11)){

                day = 1;
                mount++;
                System.out.println("Завтра будет " + day + " день " + mount + " месяца " + year +" года");

            } else if (day == 28 && mount == 2){
                day = 1;
                mount = 3;
                System.out.println("Завтра будет " + day + " день " + mount + " месяца " + year +" года");
            } else {
                day++;
                System.out.println("Завтра будет " + day + " день " + mount + " месяца " + year +" года");
            }


        }

}
