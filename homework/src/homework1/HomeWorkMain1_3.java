package homework1;

import java.util.Scanner;

public class HomeWorkMain1_3 {
    public static void main(String[] args) {

        String  Vasia = "Вася";
        String Anastasiia = "Анастасия";
        String other = "Добрый день, а вы кто?";



        Scanner scanner = new Scanner(System.in);
       System.out.println("Введите Ваше имя");
        String answer = scanner.nextLine();

        if(answer.equals(Vasia)){
            System.out.println("Привет! \nЯ тебя так долго ждал");
        }
        if(answer.equals(Anastasiia)){
            System.out.println("Я тебя так долго ждал");
        }
        if(!answer.equals(Vasia)){
            if (!answer.equals(Anastasiia)) {

                System.out.println(other);
            }
        }


        System.out.println("Введите Ваше имя");
        String answer1 = scanner.nextLine();

        if(answer1.equals(Vasia)){
            System.out.println("Привет! \nЯ тебя так долго ждал");
        }
        else if(answer1.equals(Anastasiia)){
            System.out.println("Я тебя так долго ждал");
        }
        else {
            System.out.println(other);
        }

        System.out.println("Введите Ваше имя");
        String answer2 = scanner.nextLine();
        switch (answer2){
            case "Вася":
                System.out.println("Привет! \nЯ тебя так долго ждал");
                break;
             case "Анастасия":
                 System.out.println("Я тебя так долго ждал");
                 break;
              default:
                  System.out.println(other);
        }



    }
}
