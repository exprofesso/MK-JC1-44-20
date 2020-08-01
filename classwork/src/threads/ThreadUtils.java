package threads;

public class ThreadUtils {
    public static void printCurrentThread(){
        Thread thread = Thread.currentThread();

        System.out.println("**********");
        System.out.println("id: " + thread.getId());
        System.out.println("name: " + thread.getName());
        System.out.println("state: " + thread.getState());
        System.out.println("group: " + thread.getThreadGroup());
        System.out.println("__________");
    }
}
