package loop;

public class LoopMain2 {
    public static void main(String[] args) {

        int [] array = new int [10];
        array [0] = 1;
        array [1] = 2;
        array [2] = 3;
        array [3] = 4;
        array [4] = 5;
        array [5] = 6;
        array [6] = 7;
        array [7] = 8;
        array [8] = 9;
        array [9] = 10;


        int iter = 0;
        for (int element : array){
            if(iter % 2 == 0){
                System.out.println(element);
            }
        }

    }
}
