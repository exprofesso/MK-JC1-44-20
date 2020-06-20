package homework1;

import java.util.Objects;
import java.util.Scanner;

public class OperatorMain12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какие хочешь макароны? ");
        String pasta = scanner.nextLine();

        if (Objects.equals(pasta, "Barilla")){
            System.out.println("Покупаем");
            if (Objects.equals(pasta, "Макфа")){
                System.out.println("Покупаем");
            }
        }
        System.out.println(" Ох иду домой");

    }
}
