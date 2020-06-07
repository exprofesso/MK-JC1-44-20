package homework2;

import java.util.Random;

public class taskmain2 {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Цикл do while ");
        int homework [] = new int[10];
        int a = 0;
        do {
            homework[a] = random.nextInt(10);
            System.out.print(homework[a]+"\t");
            a++;

        }
        while ( a < homework.length);
        System.out.println("\n");


        System.out.println("Цикл While ");
        int homework1 [] = new int[10];
        int b = 0;
        while ( b < homework1.length){
            homework1[b] = random.nextInt(10);
            System.out.print(homework1[b]+"\t");
            b++;
        }
        System.out.println("\n");

        System.out.println("Цикл For ");
        int homework2 [] = new int[10];
        for (int  i = 0; i < homework2.length; i++) {
            homework2[i] = random.nextInt(10);
            System.out.print(homework2[i]+"\t");
        }
        System.out.println("\n");

        System.out.println("Цикл Foreach ");
        int homework3 [] = new int[10];
        for (int  i: homework3) {
            homework3[i] = random.nextInt(10);
            System.out.print(homework3[i]+"\t");
        }
        System.out.println("\n");


    }
}
