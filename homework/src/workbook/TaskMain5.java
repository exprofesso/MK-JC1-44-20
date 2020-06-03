package workbook;

public class TaskMain5 {
    public static void main(String[] args) {
        int rubli = 55674;

        if (rubli % 10 == 1){
            System.out.println("У Вас " + rubli + " рубль");
        } else if (rubli % 10 >= 2 && rubli % 10 <=4){
            System.out.println("У Вас " + rubli + " рубля");
        } else if (rubli % 10 >= 5 && rubli % 10 <= 9 || rubli % 10 == 0){
            System.out.println("У Вас " + rubli + " рублей");
        } else {
            System.out.println("Не верно, у Вас 0 или Вы вообще ушли в минус");
        }
    }
}
