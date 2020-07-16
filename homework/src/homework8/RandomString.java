package homework8;

import java.util.Random;
/*

    Написать класс с RandomString в котором будет один статический метод String random(int stringLength):
 3.1. Параметр метода это количество символов которые должно быть в строке
 3.2. Буквы в строке: Латиница, Кирилица, Пробел

* */

public class RandomString {

    public static void main(String[] args) {

        System.out.println(StringRandom(6));
        System.out.println(StringRandom(6));
        System.out.println(StringRandom(6));
        System.out.println(StringRandom(6));


    }


    static String StringRandom(int stringLength){

        char[] chars = "ACEFGHJKLMNPQRUVWXYabcdefhijkprstuvwxАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя ".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < stringLength - 1; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        return output;
    }



}
