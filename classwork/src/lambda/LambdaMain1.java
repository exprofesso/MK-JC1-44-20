package lambda;

import threads.ThreadUtils;
import threads.dto.InfinityThread;

public class LambdaMain1 {
    public static void main(String[] args) {
        ThreadUtils.printCurrentThread();

        Thread thread = new Thread(() -> {
            int i = 0;
            while (true){
                    System.out.println(Thread.currentThread().getName() + " i = "+ i++);
                }
        });
        thread.start();


    }
}
