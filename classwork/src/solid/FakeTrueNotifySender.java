package solid;

public class FakeTrueNotifySender implements INotifySender{
    @Override
    public boolean send(String text, String name) {
        return true;
    }
}
