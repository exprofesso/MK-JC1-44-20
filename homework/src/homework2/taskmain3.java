package homework2;



public class taskmain3 {
    public static void main(String[] args) {

        System.out.println("Сортировка пузырьком на Java");

        int array[] = new int[]{5, 3, 2, 6, 7, 8, 9, 4, 1, 9, 5, 10};
        for (int i = array.length - 1; i > -1; i--) {

            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n");


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

        System.out.println("\n");
        System.out.println("Сортировка выбором на Java");

        int massiv[] = new int[]{5, 3, 2, 6, 7, 8, 9, 4, 1, 10, 5, 5};

                for (int i = 0; i < massiv.length; i++) {

                    int min_idx = i;
                    for (int j = i + 1; j < massiv.length; j++)
                        if (massiv[j] < massiv[min_idx])
                            min_idx = j;

                    int temp = massiv[min_idx];
                    massiv[min_idx] = massiv[i];
                    massiv[i] = temp;
                    System.out.print(massiv[i] + "\t");
                }
        }

    }

