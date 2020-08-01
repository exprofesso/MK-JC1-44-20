package file;

import java.io.*;

public class FilesMain3 {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try{
//            BufferedWriter writer = new BufferedWriter(new FileWriter("123.txt"), 100_001);
            FileWriter fileWriter = new FileWriter("123.txt");
            writer = new BufferedWriter(fileWriter);

            for (int i = 0; i < 100; i++) {
                writer.write('1');
            }
        } catch (IOException e){
            System.out.println("Ошибка записи файла. " + e.getMessage());
            return;
        } finally {
            try {
                if(writer != null){
                    writer.flush();
                    writer.close();
                }
            } catch (IOException e){
                System.out.println("Мы не смогли закрыть файл");
            }
        }

        try{
            BufferedReader reader = new BufferedReader(new FileReader("123.txt"));
        } catch (IOException e){
            System.out.println("Ошибка чтени файла");
            return;
        }
    }
}
