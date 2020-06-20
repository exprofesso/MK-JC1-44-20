package obj.core;

public class ManWithConstructor {

    private String name;
    private int hairLergth;

    public ManWithConstructor(String name){
        this.name = name;
        this.hairLergth = 3;
    }

    public ManWithConstructor(){
        this.name = "Smit";
        this.hairLergth = 0;


    }

    public String getName(){
        return this.name;
    }

    public int getHairLergth(){

        return this.hairLergth;
    }

    public void grou() {
        this.hairLergth += 1; // лучше всегда писать this если (мы работаем с переменной класса) поля класса должны быть приватными
        // методы гетеры и сеторы
    }

    protected void setName (String name){
        this.name = name;
    }



}
