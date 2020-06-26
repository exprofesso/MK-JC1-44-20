package obj.core;

public class Animal {

    private String poroda;
    private static int currentCount = 3_000_000;

    public Animal(String poroda){
        this.poroda = poroda;
        currentCount +=1;
    }
    public String getPoroda(){
        return poroda;
    }

    public String breed (String a){
        String p = " сибирская";
        return a + p;
    }

    public static int quantity (){
        int x = 1000000;
        return x;
    }
    public static int populate (){
        return currentCount;
    }






}
