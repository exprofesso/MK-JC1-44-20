package homework6;

public class belapbLoader extends SiteLoader {



    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.belapb.by/ExCardsDaily.php?ondate=06/26/2020", currencyName);
    }

    protected double handle(String content, SiteLoader.Currency currencyName) {
        //TODO дописываем код сюда
        double d1;

        if(Currency.USD.equals(currencyName)){
        d1 = new Double(content.substring(content.indexOf("840") + 88, content.indexOf("840") + 93));
           return d1;
        }
        if (Currency.EUR.equals(currencyName)){
        d1 = new Double(content.substring(content.indexOf("978") + 88, content.indexOf("978") + 93));
           return d1;
        }
         if (Currency.RUS.equals(currencyName)){
         d1 = new Double(content.substring(content.indexOf("643") + 90, content.indexOf("643") + 95));
            return d1;
         } else {
             System.out.println(content);
             return 0;
         }

    }

}
