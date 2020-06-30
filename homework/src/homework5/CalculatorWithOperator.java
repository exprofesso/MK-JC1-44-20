package homework5;

public class CalculatorWithOperator {
    public final double plus(double a, double b){
        return a + b;
    }
    public final double minus (double a, double b){
        return a - b;
    }

    public final double div (double a, double b){
        return a / b;
    }
    public final double multiply (double a, double b){
        return a * b;
    }

   // возведение в степерь
    public double power (double a, double b){
        double result = a;
        for (int i = 1; i < b; i++){
            result *= a;
        }
        return result;
    }
    // модуль числа

    public int modul(int a) {
        if (a > 0) {
            return a - 0;
        }
        if (a < 0) {
            return 0 - a;
        } else {
            return 0;
        }
        // корень числа
    }
        public double sqrt(double a) { return Math.sqrt(a); };





}
