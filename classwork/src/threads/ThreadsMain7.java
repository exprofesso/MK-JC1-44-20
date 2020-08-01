package threads;

import threads.dto.MyThread;

public class ThreadsMain7 {
    public static void main(String[] args) {
        ThreadUtils.printCurrentThread();

        Thread myThread = new MyThread();
        Thread myThread2 = new MyThread();
        myThread.start();
        myThread2.start();
        try {
            myThread.join();
            myThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}
