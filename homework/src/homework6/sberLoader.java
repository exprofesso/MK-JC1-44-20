package homework6;

public class sberLoader extends SiteLoader {

    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.bps-sberbank.by/page/currency-exchange-cards", currencyName);
    }

    protected double handle(String content, SiteLoader.Currency currencyName) {
        //TODO дописываем код сюда
        double d1;
        String s1;
     //   System.out.println(content);

        if(Currency.USD.equals(currencyName)){
            s1 = content.substring(content.lastIndexOf("USD") + 45, content.lastIndexOf("USD") + 51);
            d1 = new Double(s1.replace(",", "."));
            return d1;
        }
        if (Currency.EUR.equals(currencyName)){
            s1 = content.substring(content.lastIndexOf("EUR") + 45, content.lastIndexOf("EUR") + 51);
            d1 = new Double(s1.replace(",", "."));
            return d1;
        }
       if (Currency.RUS.equals(currencyName)){
            s1 = content.substring(content.lastIndexOf("RUB") + 45, content.lastIndexOf("RUB") + 51);
            d1 = new Double(s1.replace(",", "."));
            return d1;
        } else {
            System.out.println(content);
            return 0;
        }

    }

}




