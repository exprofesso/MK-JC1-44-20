package threads;

import threads.dto.MyThread;

public class ThreadsMain1 {
    public static void main(String[] args) {
        ThreadUtils.printCurrentThread();

        Thread myThread = new MyThread();
        myThread.start();
    }
}
