package strings;

import java.util.Scanner;

public class StringMain4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Илья";
        String name = scanner.nextLine();

        System.out.println( str == name);
        System.out.println( str.equals(name));



        String s = String.valueOf(1000);
        String s1 = str.valueOf(1000);

        System.out.println(s);
        System.out.println(s1);

    }
}
