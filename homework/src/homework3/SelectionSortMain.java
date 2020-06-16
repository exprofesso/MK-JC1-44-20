package homework3;

public class SelectionSortMain {
    public static void main(String[] args) {

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
