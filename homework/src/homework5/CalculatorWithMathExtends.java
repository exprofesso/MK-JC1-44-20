package homework5;

public class CalculatorWithMathExtends extends CalculatorWithMathCopy{

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
