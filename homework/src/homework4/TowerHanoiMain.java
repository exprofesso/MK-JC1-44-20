package homework4;

import java.util.Arrays;
import java.util.Scanner;

public class TowerHanoiMain {
    public static void main(String[] args) {

        String d = "*";

        System.out.println("Введите высоту башни");
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();

//  создание многомерного массива
        String arr [][] = new String[r][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = d;
            }

        }
        // создание массива для проверки
        String etalon [][] = new String[r][3];
        for (int i = 0; i < etalon.length; i++) {
            for (int j = 0; j < etalon[i].length; j++) {
                etalon[i][j] = d;
            }

        }


        // заполнение первого столбца в первом массиве
        for (int i = 0; i < r; i++){
            int temp =  i + 1;
            arr[i][0] = String.valueOf(temp);
        }
        // заполнение последнего столбца во втором массиве
        for (int i = 0; i < r; i++){
            int temp =  i + 1;
            etalon[i][2] = String.valueOf(temp);
        }


        // выведение на экран

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();

        }


        while (!Arrays.deepEquals(etalon, arr)){
            System.out.println("Бублик с каким номером вы хотите переместить?");
            String bagel = scanner.next();

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j].equals(bagel)) {
                        arr[i][j] = d;
                    }
                }
            }

            System.out.println("Укажите число в строке куда мы переносим единицу?");
            int a1 = scanner.nextInt() - 1;
            System.out.println("Укажите число в столбце куда мы переносим единицу?");
            int a2 = scanner.nextInt() - 1;
            arr[a1][a2] = bagel;


            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }

        }



    }

}
