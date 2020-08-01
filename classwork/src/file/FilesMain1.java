package file;

import java.io.*;

public class FilesMain1 {
    public static void main(String[] args) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("123.txt"));

            writer.write('h');
            writer.flush();
        } catch (IOException e){
            System.out.println("Ошибка записи файла. " + e.getMessage());
            return;
        }

        try{
            BufferedReader reader = new BufferedReader(new FileReader("123.txt"));
        } catch (IOException e){
            System.out.println("Ошибка чтени файла");
            return;
        }
    }
}
