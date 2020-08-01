package solid;

public class ConsoleNotifySender implements INotifySender{

    @Override
    public boolean send(String text, String name) {
        System.out.println("Отправляем уведомление " + name);
        System.out.println("Текст: " + text);
        return true;
    }
}
