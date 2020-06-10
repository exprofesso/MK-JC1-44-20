package array;

import java.util.Random;

public class ArrayMain1 {
    public static void main(String[] args) {

        int [] array = new int [10];
        Random random = new Random();
        for (int  i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
            printArray(array);


            System.out.println();
        for (int  i = 0; i < array.length; i++) {
            array[i] += 10;   /// увеличение значение каждого элемента на 10
        }
        printArray(array);

        }


        // метод для печати массива.

        public static void printArray(int[] arr){
            System.out.print("array: ");
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }

        }


    }

