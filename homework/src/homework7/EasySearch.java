package homework7;


public class EasySearch implements ISearchEngine {

    @Override
    public int search(String txt, String w) {
      String content = txt.toLowerCase().replaceAll("\\p{Punct}", " ");

        int counter = 0;
        int index = 0;
        int curInd = 0;

        while ((index = content.indexOf(w +" ", curInd)) != -1) {
            counter++;
            curInd = index + w.length();
        }
        return counter;
    }
}
