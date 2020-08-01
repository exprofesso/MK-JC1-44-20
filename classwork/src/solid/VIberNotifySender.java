package solid;

import java.util.Random;

public class VIberNotifySender implements INotifySender{

    String serverAddress = "viber.com";
    Random random = new Random();
    @Override
    public boolean send(String text, String name) {
        // Реализация отправки через Вайбер

        return random.nextBoolean();
    }
}
