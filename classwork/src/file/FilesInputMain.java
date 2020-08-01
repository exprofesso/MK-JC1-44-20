package file;

import obj.core.Man;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FilesInputMain  implements Serializable {
    public static void main(String[] args) {

       List<Man> mansL = new LinkedList<>();
        try (FileInputStream fis = new FileInputStream("zzz_1.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)) {


            while (fis.available() != 0){
             mansL.add((Man) ois.readObject());
            }

        } catch (IOException | ClassNotFoundException e ){
            System.out.println("Что то пошло не так");
            throw new RuntimeException(e);
        }
        List<List<Man>> mansL2 = new LinkedList<>();
        try (FileInputStream fis = new FileInputStream("zzz.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)) {


            while (fis.available() != 0){
              //  mansL2.add((Man) ois.readObject());
            }

        } catch (IOException /*| ClassNotFoundException */ e ){
            System.out.println("Что то пошло не так");
            throw new RuntimeException(e);
        }

        System.out.println(mansL2);


    }
}
