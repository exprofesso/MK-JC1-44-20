package homework7;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class EasySearchMain extends EasySearch {

    public static void main(String[] args) {

            //
        String importTxt = readAllBytesJava7("/Users/sergeypodkolzin/Documents/GitHub/MK-JC1-44-20/homework/resources/warAndPeace.txt");


        EasySearchMain test = new EasySearchMain();

        // Поиск сколько раз слово встречается в тексте

        System.out.println("Слово ВОЙНА встречается в данном тексте " + test.search(importTxt, "война") + " раза");
        System.out.println("Слово И встречается в данном тексте " + test.search(importTxt, "и") + " раза");
        System.out.println("Слово МИР встречается в данном тексте " + test.search(importTxt, "мир") + " раза");


        // перебор в коллекции уникальных словж

        importTxt = importTxt.toLowerCase().replaceAll("\\p{Punct}", "");

        String [] txtArray = importTxt.split(" ");

        ArrayList<String> string_list = new ArrayList<String>();

        for(int i=0; i < txtArray.length; i++)
        {
            String word = txtArray[i];

            if( string_list.contains(word) == false )
            {
                string_list.add(word);
            }
        }

        //Колличество уникальных слов в тексте
        int counter = string_list.size();

        System.out.println("Колличество уникальных слов в тексте " + counter);

        System.out.println("--------");
        //  System.out.print(string_list);


        // Подсчет сколько каждое слово встречаеться в тексте

        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : txtArray)
        {
            if (!wordToCount.containsKey(word))
            {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet())
        {
            // Вывести все слова
         //   System.out.println(word + " " + wordToCount.get(word));
        }

      // Подсчет слов по частоте их использования с самого популярного


        List<Map.Entry<String, Integer>> wordsCounter = new ArrayList<>(wordToCount.entrySet());

        Collections.sort(wordsCounter,
                new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return o2.getValue().compareTo(o1.getValue());
                    }
                }
        );

        for (int i = 1; i < 11; i++) {
            Map.Entry<String, Integer> p = wordsCounter.get(i);

            System.out.println("Эти слова '" + p.getKey() + "' встречаются в тексте " + p.getValue() + " раз");
        }



}

    private static String readAllBytesJava7(String filePath)
    {
        String content = "";

        try
        {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return content;
    }

}
