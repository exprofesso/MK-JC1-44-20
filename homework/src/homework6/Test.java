package homework6;

public class Test {
    public static void main(String[] args) {
        NBRBLoader loader = new NBRBLoader();
        belapbLoader loader1 = new belapbLoader();
        alfaLoader loader2 = new alfaLoader();

        System.out.println("Нац Банк");

        System.out.println(loader.load(SiteLoader.Currency.USD));
        System.out.println(loader.load(SiteLoader.Currency.EUR));
        System.out.println(loader.load(SiteLoader.Currency.RUS));
        System.out.println();

        System.out.println("БелгазпромБанк");

        System.out.println(loader1.load(SiteLoader.Currency.USD));
        System.out.println(loader1.load(SiteLoader.Currency.EUR));
        System.out.println(loader1.load(SiteLoader.Currency.RUS));
        System.out.println();

        System.out.println("АльфаБанк");
        System.out.println(loader2.load(SiteLoader.Currency.USD));
        System.out.println(loader2.load(SiteLoader.Currency.EUR));
        System.out.println(loader2.load(SiteLoader.Currency.RUS));




    }
}
