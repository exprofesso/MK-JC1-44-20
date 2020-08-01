package solid;

public class FakeFalseNotifySender implements INotifySender {
    @Override
    public boolean send(String text, String name) {
        return false;
    }
}
