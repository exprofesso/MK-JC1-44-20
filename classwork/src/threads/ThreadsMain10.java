package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadsMain10 {
    public static Integer a = 0;
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);


        for (int i = 0; i < 10; i++){

            executorService.execute(() ->{
                int tmp = 0;
                for (int j = 0; j < 10; j++){
                    tmp = j;
                }
                a += tmp;
            });

        }
        executorService.shutdown();
        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());
        System.out.println(a);
    }
}
