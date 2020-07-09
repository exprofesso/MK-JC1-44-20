package obj.core;

import java.util.Objects;

public class Man implements Comparable<Man> {

    private String name;
    private int hairLergth;

    public Man (){

    }
    public  Man (String n, int h){
         name = n;
         hairLergth = h;

    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", hairLergth=" + hairLergth +
                '}';
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return hairLergth == man.hairLergth &&
                Objects.equals(name, man.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hairLergth);
    }

    @Override
    public int compareTo(Man o) {
        return hairLergth - o.hairLergth;
    }
}
