package homework5;

public class Color {
    private final int red = 1;
    private final int orange = 2;
    private final int yellow = 3;
    private final int green = 4;
    private final int blue = 5;
    private final int darkBlue = 6;
    private final int purple = 7;
    private int number;


    //Создать конструктор который будет принимать параметр int. Туда мы будем передавать номер цвета.
    public Color (int number){
        this.number = number;

    }

// Метод getNumber должен вернуть номер цвета который мы передали в конструктор.
    public int getNumber(){
        return number;
    }

 //  Метод getName должен возвращать название цвета ввиде строки на русском, если цвет нам не известен возвращать строку "неизвестно" .
    // В методе getName должен использоваться switch и константы объявленные при выполнении первого пункта.

    public String getName(){

        switch (number){
            case red:
                return " Красный";

            case orange:
                return " Оранживый";

            case yellow:
                return " Желтый";

            case green:
                return " Зеленый";

            case blue:
                return " Голубой";

            case darkBlue:
                return " Синий";

            case purple:
                return " Фиолетовый";

                default:
                    return " Неизвестный цвет";
        }




    }




}
