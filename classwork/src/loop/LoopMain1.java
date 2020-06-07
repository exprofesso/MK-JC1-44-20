package loop;

public class LoopMain1 {
    public static void main(String[] args) {
        int a = 0;
        for (;;){
            if(a > 100) {
                return;
            }
            System.out.println("Привет как дела " + a);
            a++;
        }


    }
}
