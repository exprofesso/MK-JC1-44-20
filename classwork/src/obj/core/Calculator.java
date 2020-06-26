package obj.core;

public class Calculator {
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
        double result = a;
        for (int i = 1; i < b; i++){
            result *= a;
        }
        return result;
    }



}
