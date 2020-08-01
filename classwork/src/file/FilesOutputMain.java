package file;

import obj.core.Man;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class FilesOutputMain {

    public static void main(String[] args) {
        Random random = new Random();

        List<Man> manList = new LinkedList<>();
        for (int x = 0; x < 100; x++) {
            manList.add(new Man(String.valueOf(random.nextLong()), random.nextInt()));
        }
        for (int x = 0; x < 100; x++) {
            System.out.println(manList.get(x));
        }

        try (FileOutputStream fos = new FileOutputStream("zzz.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos);
                ) {

            oos.writeObject(manList);

        } catch (IOException e){
            System.out.println("Ошибка");
        }


        try (FileOutputStream fos = new FileOutputStream("zzz_1.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            for(Man man: manList){
                oos.writeObject(man);
            }

        } catch (IOException e){
            System.out.println("Ошибка");
        }

    }
}
