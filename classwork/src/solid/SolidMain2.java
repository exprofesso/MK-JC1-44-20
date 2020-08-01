package solid;

public class SolidMain2 {
    public static void main(String[] args) {
        boolean sended = false;
        int senderType = 4;
       do {
            INotifySender sender = getCurrenrtSender(senderType);

            sended  = sender.send("У нас новый заказ", "Анатолий Иванов");
            if (sended) {
                System.out.println("Уведомление успешно отправлено ");

            } else {
                senderType++;
                System.out.println("Уведомление не отправлено, надо повторить");
            }
        } while (!sended);

    }
    public static INotifySender getCurrenrtSender(int option){
        switch (option){
            case 0:
                return new FakeFalseNotifySender();
            case 1:
                return new FakeTrueNotifySender();
            case 2:
                return new ConsoleNotifySender();
            case 3:
                return new VIberNotifySender();
            case 4:
                return new ViberAndConsoleNotifySender();
                default:
                    return new ConsoleNotifySender();
        }


    }

}
