package loop;

public class LoopMain3 {
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


        for (int element : array){
            if(element == 5){

                continue;
            }
                System.out.println(element);
            }
        System.out.println("Расчет окончен");

        }

    }

