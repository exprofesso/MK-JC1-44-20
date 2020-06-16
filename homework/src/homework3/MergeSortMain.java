package homework3;

import java.util.Arrays;

public class MergeSortMain {
    public static void main(String[] args) {
        int massiv[] = new int[]{5, 3, 2, 6, 7, 8, 9, 4, 1, 9, 5, 10, 22, 17};
       int answer [] = divide(massiv);
        System.out.println(Arrays.toString(answer));


    }


    // сортировка слиянием
    public static int[] divide(int[] arr) {
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int[] arr2 = new int[arr.length];
        int[] result = megaArr(arr1, arr2, 0, arr.length);
        return result;
    }

            // объединение двух массивов.

       public static int[] megaArr (int[] arr1, int[] arr2, int pointA, int pointB){


               if (pointA >= pointB - 1) {
                   return arr1;
               }

               int middle = pointA + (pointB - pointA) / 2;
               int[] sorted1 = megaArr(arr1, arr2, pointA, middle);
               int[] sorted2 = megaArr(arr1, arr2, middle, pointB);

               int index1 = pointA;
               int index2 = middle;
               int destIndex = pointA;

               int[] result = sorted1 == arr1 ? arr2 : arr1;
               while (index1 < middle && index2 < pointB) {
                   result[destIndex++] = sorted1[index1] < sorted2[index2]
                           ? sorted1[index1++] : sorted2[index2++];
               }
               while (index1 < middle) {
                   result[destIndex++] = sorted1[index1++];
               }
               while (index2 < pointB) {
                   result[destIndex++] = sorted2[index2++];
               }
               return result;

        }



}
