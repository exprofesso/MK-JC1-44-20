package workbook;

public class TaskMain4 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int r = 2;
        double pifagor;
        pifagor = Math.sqrt((a * a) + (b * b)) / 2;

        if (r < pifagor){
            System.out.println("Радиус вашего круга меньше чем прямоугольник");
        } else {
            System.out.println("Радиус вашего круга больше чем прямоугольник");
        }
    }
}
