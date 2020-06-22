package homework4;

import java.util.Scanner;



public class TowerHanoiAutomaticMain {
    public static void main(String[] args) throws InterruptedException{
        String d = "*";

        System.out.println("Введите высоту башни");
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();

        //  создание многомерного массива
        String arr[][] = new String[r][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = d;
            }

        }


        // заполнение первого столбца в первом массиве
        for (int i = 0; i < r; i++) {
            int temp = i + 1;
            arr[i][0] = String.valueOf(temp);
        }



        // выведение на экран

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();

        }


// start_peg начальный столбик
// destination_peg конечный столбик
// buffer_peg промежуточный столбик
// plate_quantity изначальное количество колец (будет уменьшаться алгоритмом


        int start_peg = 1, destination_peg = 3, buffer_peg = 2, plate_quantity = r;
        hanoiTowers(plate_quantity, start_peg, destination_peg, buffer_peg, arr,r);


    }
    public static void hanoiTowers(int quantity, int from, int to, int buf_peg, String[][] arr, int r) throws InterruptedException {
        if (quantity != 0)
        {
            String d = "*";
            hanoiTowers(quantity-1, from, buf_peg, to,arr,r);
            System.out.println("\n"+"" + from + " -----> " + to );

            //Создаем переменную to_border, чтобы определить в какой элемент массива вставлять кольцо
            int to_border=r-1;
            //ищем пустое место снизу столбика
            for (int i = r-1; i >-1; i--) {
                if (arr[i][to-1].equals(d)){
                    to_border=i;break;
                }
            }
            //Создаем переменную from_border, чтобы определить из какого элемента массива забирать кольцо
            int from_border=0;
            //ищем кольцо сверху столбика
            for (int i = 0; i <r; i++) {
                if (!arr[i][from-1].equals(d)){
                    from_border=i;break;
                }
            }
            //присваиваем элементу массива столбика получателя элемент массива столбика донора (перекидываем кольцо)
            arr[to_border][to-1]=arr[from_border][from-1];
            //удаляем кольцо из элемента массива солбика донора
            arr[from_border][from-1]="*";

            // выведение на экран

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                Thread.sleep(100);
                System.out.println();
            }

            hanoiTowers(quantity-1, buf_peg, to, from,arr,r);
        }
    }

}
