package file;

import obj.core.Man;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class FilesMain10 {
    public static void main(String[] args) {

        List<Man> mans = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream("mans.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)){
            while (fis.available() != 0){
                mans.add((Man)ois.readObject());
            }
        } catch (IOException | ClassNotFoundException e){
            System.out.println("Неполучается");
            throw new RuntimeException(e);
        }

        System.out.println(mans.size());
        System.out.println(mans);
    }
}
