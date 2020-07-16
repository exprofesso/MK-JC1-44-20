package homework8;

public class Person {

    /*
    1. Написать класс Person который содержит поля:
     1.1. Строку nick - псевдоним пользователя
    1.2. Строку password - пароль
     */


    private String nick;
    private String password;

    public Person(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
