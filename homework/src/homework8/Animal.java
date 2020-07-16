package homework8;

public class Animal {
    /*
    2. Написать класс Animal:
    2.1. Число age - возраст
    2.2. Строка nick - кличка
     */

    private int age;
    private String nick;

    public Animal(int age, String nick) {
        this.age = age;
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
