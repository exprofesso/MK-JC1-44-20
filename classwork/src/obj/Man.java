package obj;

public class Man {

    private String name;
    private int hairLergth;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getHairLergth(){
        return  this.hairLergth;
    }

    public void helloMan (String name){

        System.out.println("Привет, " + name + " меня зовут " + this.name);
    }

     public static void printHello(String name){

         System.out.println("Привет, " + name);
         }

    public void grou() {
        this.hairLergth += 1; // лучше всегда писать this если (мы работаем с переменной класса) поля класса должны быть приватными
        // методы гетеры и сеторы
     }

}
