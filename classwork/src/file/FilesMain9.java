package file;

import obj.core.Man;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FilesMain9 {
    public static void main(String[] args) {

        Random rnd = new Random();

        List<Man> mans = new ArrayList<>();

        for (int i = 0; i < 99; i++) {
            mans.add(new Man(String.valueOf(rnd.nextLong()), rnd.nextInt()));
        }

        try(FileOutputStream fos = new FileOutputStream("mans.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            for (Man man : mans) {
                oos.writeObject(man);
            }
        } catch (IOException e){
            System.out.println("Ошибка записи файла");
            throw new RuntimeException(e);
        }
    }
}
