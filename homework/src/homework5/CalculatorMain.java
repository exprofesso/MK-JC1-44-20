package homework5;

public class CalculatorMain {
    public static void main(String[] args) {

        // Задние 1 и 2

        Color color1 = new Color(3);
        Color color2 = new Color(5);


        System.out.println(color1.getNumber() + "" + color1.getName());
        System.out.println(color2.getNumber() + "" + color2.getName());


        // Задание 3 - 6;
        CalculatorWithOperator calc = new CalculatorWithOperator();
        CalculatorWithOperator calc2 = new CalculatorWithOperator();

            // 4.1 + 15 * 7 + (28 / 5) ^ 2
        double a = 4.1;
        double b = calc.multiply(15, 7);
        double c = calc.div(28, 5);
        c = calc.power(c, 2);
        double summa = a + b + c;
        double summa2 = summa / 0.0d;

        System.out.println("Задание 3 - 6");
        System.out.printf("%.5f", summa);
        System.out.println();
        System.out.printf("%.5f", summa / 0);
        System.out.println();
        System.out.printf("%.5f", summa2);
        System.out.println();


            // Задание 7-8;
        CalculatorWithMathCopy copyCalc = new CalculatorWithMathCopy();
        b = copyCalc.multiply(15, 7);
        c = copyCalc.div(28, 5);
        c = copyCalc.power(c, 2);
        summa = a + b + c;
        summa2 = summa / 0.0d;
        System.out.println("Задание 7 - 8");
        System.out.printf("%.5f", summa);
        System.out.println();
        System.out.printf("%.5f", summa / 0);
        System.out.println();
        System.out.printf("%.5f", summa2);
        System.out.println();


        // Задание 9 - 10

        CalculatorWithMathExtends MathCalc = new CalculatorWithMathExtends();
        b = MathCalc.multiply(15, 7);
        c = MathCalc.div(28, 5);
        c = MathCalc.power(c, 2);
        summa = a + b + c;
        summa2 = summa / 0.0d;
        System.out.println();
        System.out.println("Задание 9 - 10");
        System.out.printf("%.5f", summa);
        System.out.println();
        System.out.printf("%.5f", summa / 0);
        System.out.println();
        System.out.printf("%.5f", summa2);
        System.out.println();


    }
}