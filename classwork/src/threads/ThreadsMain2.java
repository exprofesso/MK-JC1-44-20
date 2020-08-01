package threads;

import threads.dto.MyThread;

public class ThreadsMain2 {
    public static void main(String[] args) {
        ThreadUtils.printCurrentThread();

        Thread myThread = new MyThread();
        myThread.run();
    }
}
