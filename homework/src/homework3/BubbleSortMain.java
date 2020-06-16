package homework3;

public class BubbleSortMain {
    public static void main(String[] args) {

        int arr[] = new int[]{5, 3, 2, 6, 7, 8, 9, 4, 1, 9, 5, 10};
        for (int i = 0; i < arr.length; i++) {

            for (int j = arr.length - 1; j > i; j--) {

                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
            System.out.print(arr[i] + "\t");
        }



    }
}
