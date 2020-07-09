package generics;

public class BoxGenericsNumber<Z extends Number> {
    private Z iter;

    public Z getIter() {
        return iter;
    }

    public void setIter(Z iter) {
        this.iter = iter;
    }

    public Z add(Z number){
       double value = number.doubleValue() + iter.doubleValue();
       iter = (Z) Double.valueOf(value);
       return this.iter;
    }

    public static void print (BoxGenericsNumber<?> value){
        System.out.println(value);
    }
    public static void printInt (BoxGenericsNumber<? extends Integer> value){
        System.out.println(value);
    }
    public static void printDouble (BoxGenericsNumber<? super Double> value){
        System.out.println(value);
    }
    public static <T extends Number> void copy (BoxGenericsNumber<? super T> dest, BoxGenericsNumber<? extends T> src){
        dest.setIter(src.getIter());
       // src.setIter(dest.getIter());


    }




}
