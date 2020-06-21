package homework4;

import java.util.Arrays;
import java.util.Scanner;

public class TowerHanoiAutomaticMain {
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
            int run = r*r-1;

           for (int z = 0; z < run; z++ ){
               String bagel = String.valueOf(z);




               for (int i = 0; i < arr.length; i++) {
                   for (int j = 0; j < arr[i].length; j++) {
                       if (arr[i][j].equals(bagel)) {
                           arr[i][j] = d;
                       }
                   }
               }



           }





        }






    }
}
