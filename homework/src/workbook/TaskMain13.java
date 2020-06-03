package workbook;

public class TaskMain13 {
    public static void main(String[] args) {
        for (int n = 200; n>=-20; n--) {
                boolean isPrime = true;
            if (n == 1) {
                break;
            }
                for (int i = 2; i < n; i++) {

                    if ((n % i) == 0) {
                        isPrime = false;

                    }

                }
                if (isPrime) System.out.println(n + " Простое");
                else System.out.print("");
            }

    }
}


