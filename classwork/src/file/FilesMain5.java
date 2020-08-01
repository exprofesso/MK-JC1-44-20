package file;

import obj.core.Man;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FilesMain5 {
    public static void main(String[] args) {
        Man man1 = new Man("Илья", 10);
        try(FileOutputStream fos = new FileOutputStream("mans.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(man1.getName());
            oos.writeInt(man1.getHairLergth());
        } catch (IOException e){
            System.out.println("Ошибка записи файла");
        }
    }
}
