package strings;

public class StringMain2 {
    public static void main(String[] args) {

        String str = "Я изучаю Java";

        String strl = str + "и английский тоже ";

        System.out.println(str);

        String  strr = str.concat("и английский тоже ");

        System.out.println(str);
        System.out.println(strr);

    }
}
