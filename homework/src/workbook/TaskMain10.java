package workbook;

public class TaskMain10 {
    public static void main(String[] args) {

        int num = 9999999;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);



    }
}
