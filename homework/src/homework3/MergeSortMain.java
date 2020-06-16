package homework3;

public class MergeSortMain {
    public static void main(String[] args) {
        int massiv[] = new int[]{5, 3, 2, 6, 7, 8, 9, 4, 1, 9, 5, 10, 22, 17};

       divide(massiv);



    }


    // сортировка слиянием
        public static int [] divide (int[] arr) {
        if (arr == null){
        return null;
        }
        if (arr.length < 2){
            return arr;
        }

        int arr1[] = new int[arr.length / 2];
        int arr2[] = new int[arr.length - arr.length / 2];

        System.arraycopy(arr, 0, arr1, 0, arr.length/2); // первая половина
        System.arraycopy(arr1, arr.length / 2, arr2, 0, arr.length - arr.length / 2); // вторая половина

        arr1 = divide(arr1);
        arr2 = divide(arr2);
        return megaArr(arr1, arr2);
}


            // объединение двух массивов.

        public static  int[] megaArr (int[] arr, int[] arr1){

        int [] arr2 = new int[arr.length + arr1.length];
        int pointA = 0;
        int pointB = 0;

        for (int i = 0; i < arr2.length; i++){

            if (pointA == arr.length){
                arr2[i] = arr1[pointB];
                pointB++;

        } else if (pointB == arr1.length){
                arr2[i] = arr[pointA];
                pointA++;

            } else if (arr[pointA] < arr1[pointB]){
                arr2[i] = arr[pointA];
                pointA++;

            } else {

                arr2[i] = arr1[pointB];
                pointB++;
            }


        }

        return arr2;

        }



}
