package threads;

import threads.dto.InfinityThread;

public class ThreadsMain6 {
    public static void main(String[] args) {
        ThreadUtils.printCurrentThread();

        Thread thread = new Thread(new InfinityThread());
        thread.setDaemon(true);
        thread.start();

    }
}
