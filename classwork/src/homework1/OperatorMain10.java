package homework1;

import java.util.Scanner;

public class OperatorMain10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                int b = scanner.nextInt();

        if (a + b == 3){
            System.out.println("Привет");
        }
        else {
            System.out.println("Пока");
        }
    }
}
