package Operator;

import java.util.Objects;
import java.util.Scanner;

public class OperatorMain11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какие хочешь макароны? ");
        String pasta = scanner.nextLine();

        if (Objects.equals(pasta, "Barilla")){
            System.out.println("Покупаем");
        } else {
            System.out.println("Ох как жаль :( ");
            if (Objects.equals(pasta, "Макфа")){
                System.out.println("Покупаем");
            } else {
                System.out.println("Ох как жаль :( ");
            }
        }
        System.out.println(" Ох иду домой");

    }


}
