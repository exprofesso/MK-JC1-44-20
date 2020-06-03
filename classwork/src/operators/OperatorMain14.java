package operators;

import java.util.Scanner;

public class OperatorMain14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int  a = scanner.nextInt();

        switch (a){

            case (10):
                System.out.println("Ура 10!!!!");
            break;
            case (20):
                System.out.println("Так в самый раз");
                break;
                default:
                    System.out.println("Ну тогда я увольняюсь!!!");
        }
        System.out.println("Иду в бар!");

    }
}
