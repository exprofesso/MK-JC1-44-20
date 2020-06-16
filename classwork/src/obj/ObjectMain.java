package obj;

public class ObjectMain {

    public static void main(String[] args) {

        Man.printHello("Илья");
        Man.printHello("Коля");
        Man.printHello("Дима");
        Man.printHello("Сергей");

        //Man.helloMan();

        Man man1 = new Man();
        man1.setName("Илья");
        man1.helloMan("Антон");

        man1.setName("Вася");
        man1.helloMan("Сергей");

        Man man2 = new Man();
        man2.setName("Сережа");
        man2.helloMan("Анжелика");
        System.out.println(man2.getHairLergth());
        //man2.getHairLergth() = 2;
        System.out.println(man2.getHairLergth());
        man2.grou();
        System.out.println(man2.getHairLergth());




    }

}
