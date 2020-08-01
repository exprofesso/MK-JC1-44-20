package solid;

public class SolidMain {
    public static void main(String[] args) {


        INotifySender sender = getCurrenrtSender(2);

        boolean flag = sender.send("У нас новый заказ", "Анатолий Иванов");
        if(flag){
            System.out.println("Уведомление успешно отправлено ");

        } else {

            System.out.println("Уведомление не отправлено, надо повторить");
        }

    }
    public static INotifySender getCurrenrtSender(int option){
        switch (option){
            case 1:
                return new FakeTrueNotifySender();
            case 2:
                return new ConsoleNotifySender();
            case 3:
                return new VIberNotifySender();
                default:
                    return new ConsoleNotifySender();
        }


    }

}
