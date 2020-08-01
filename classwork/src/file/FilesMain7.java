package file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FilesMain7 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("mans.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)){
            System.out.println(ois.readObject());
            System.out.println(ois.readInt());
        } catch (IOException | ClassNotFoundException e){
            System.out.println("Неполучается");
            throw new RuntimeException(e);
        }
    }
}
