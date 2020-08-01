package file;

import java.io.*;

public class FilesMain2 {
    public static void main(String[] args) {
        try{
//            BufferedWriter writer = new BufferedWriter(new FileWriter("123.txt"), 100_001);
            FileWriter fileWriter = new FileWriter("123.txt");
            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (int i = 0; i < 100_000; i++) {
                writer.write('1');
            }

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
