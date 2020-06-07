package question;

public class questionMain3 {
    public static void main(String[] args) {
        int sum = 0;
        int i  = 0;
        while (i < 20){
            if(i % 2 == 0){
                sum += i;
                System.out.println(sum);
            }
            i++;
        }

        System.out.println(sum);

    }
}
