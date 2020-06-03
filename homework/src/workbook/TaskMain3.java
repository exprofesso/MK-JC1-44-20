package workbook;

public class TaskMain3 {
    public static void main(String[] args) {
        int a = 2343;
        int b = 7;

        if (a % 10 == b){
            System.out.println("В конце числа " + a + " есть цифра " + b);
        }
        else {
            System.out.println("В конце числа " + a + " нет цифры " + b);
        }
    }
}
