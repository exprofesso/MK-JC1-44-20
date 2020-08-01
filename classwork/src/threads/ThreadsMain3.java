package threads;

import threads.dto.MyThread;

public class ThreadsMain3 {
    public static void main(String[] args) {
        ThreadUtils.printCurrentThread();

        Thread myThread = new MyThread();
        Thread myThread2 = new MyThread();
        myThread.start();
        myThread2.start();
        System.out.println("Done");
    }
}
