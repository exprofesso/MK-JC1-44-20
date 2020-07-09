package generics;

public class Bank<T> {

    public static  <T extends Number> void transfer(T money){

      int i =  money.intValue() + money.intValue();
    }

    public void transert1(T money){

    }

    public <Z> void transert2(Z money){

    }

}
