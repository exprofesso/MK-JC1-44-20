package solid;

public class SelectNotifySender implements INotifySender{

    private VIberNotifySender viber;
    private ConsoleNotifySender console;

    // Пустой

    public SelectNotifySender() {

        return;
    }
    // viber
    public SelectNotifySender(VIberNotifySender v) {
    this.viber = v;
    }

    //  консоль
    public SelectNotifySender(ConsoleNotifySender con){
        this.console = con;
    }

    @Override
    public boolean send(String text, String name) {
        boolean viberSender = this.viber.send(text, name);
        boolean consoleSender = this.console.send(text, name);
        if(viberSender){
            for(int i = 0; i < 5; i++){
            return viberSender;
            }

        } if(consoleSender) {
            for (int i = 0; i < 5; i++) {
            return consoleSender;
            }
        }
        return false;
    }
}
