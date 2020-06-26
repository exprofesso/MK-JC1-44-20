package homework5;

public class CalculatorWithMathCopy {
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
    public double power (double a, double b){
        double c = Math.pow(a, b);
        return c;
    }
    public int modul (int a){
        return Math.abs(a);
    }

    public double sqrt(double a){
        return Math.sqrt(a);
    }




}
