package threads;

import threads.dto.MyThread;

public class ThreadsMain4 {
    public static void main(String[] args) {
        ThreadUtils.printCurrentThread();

        Thread myThread = new MyThread();
        Thread myThread2 = new MyThread();
        myThread.run();
        myThread2.run();
        System.out.println("Done");
    }
}
