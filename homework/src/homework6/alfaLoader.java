package homework6;

public class alfaLoader extends SiteLoader{



        public double load(SiteLoader.Currency currencyName) {
            return load("https://developerhub.alfabank.by:8273/partner/1.0.0/public/rates", currencyName);
        }


        protected double handle(String content, SiteLoader.Currency currencyName) {
            //TODO дописываем код сюда

            double d1;

            if(Currency.USD.equals(currencyName)){
                d1 = new Double(content.substring(content.lastIndexOf("840") - 36, content.lastIndexOf("840") - 28));
                return d1;
            }
            if (Currency.EUR.equals(currencyName)){
                d1 = new Double(content.substring(content.lastIndexOf("978") - 36, content.lastIndexOf("978") - 28));
            return d1;
            }
            if (Currency.RUS.equals(currencyName)){
                d1 = new Double(content.substring(content.lastIndexOf("643") - 36, content.lastIndexOf("643") - 28));
            return d1;
            } else {
                System.out.println(content);
                return 0;
            }

        }
    }


