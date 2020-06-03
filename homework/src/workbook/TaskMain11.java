package workbook;

public class TaskMain11 {
    public static void main(String[] args) {

        int num= 113;
        boolean isPrime = true;

        for (int i=2; i<=num/2; i++) {
          int  temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println(num + " - простое число");
        } else {
            System.out.println(num + " - составное число");
        }
    }


    }

