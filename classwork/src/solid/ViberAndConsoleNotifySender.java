package solid;

public class ViberAndConsoleNotifySender implements INotifySender{

    private VIberNotifySender viber;
    private ConsoleNotifySender console;

    public ViberAndConsoleNotifySender (VIberNotifySender viber, ConsoleNotifySender console){
        this.viber = viber;
        this.console = console;
    }

    public ViberAndConsoleNotifySender(){
        this.viber = new VIberNotifySender();
        this.console = new ConsoleNotifySender();
    }

    @Override
    public boolean send(String text, String name) {
        boolean viberSender = this.viber.send(text, name);
        boolean consoleSender = this.console.send(text, name);
        return viberSender && consoleSender;
    }
}
