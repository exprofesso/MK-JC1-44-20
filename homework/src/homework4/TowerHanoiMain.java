package homework4;

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


   // заполнение первого столбца
        for (int i = 0; i < r; i++){
            int temp =  i + 1;
            arr[i][0] = String.valueOf(temp);
        }

        // выведение на экран

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        while (arr[0][2] != "1" && arr[1][2] != "2" && arr[2][2] != "3"){
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
