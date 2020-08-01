package threads;

import threads.dto.InfinityThread;

public class ThreadsMain5 {
    public static void main(String[] args) {
        ThreadUtils.printCurrentThread();

        Thread thread = new Thread(new InfinityThread());
        thread.start();
        thread.setDaemon(true);
    }
}
