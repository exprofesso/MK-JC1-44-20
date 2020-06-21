package obj.core;
import java.util.*;
public class Calcularor {
}

    class TowersOfHanoiThree
    {
        public static Stack<Integer>[] tower = new Stack[4];
        public static int temp;

        public static void TowersOfHanoiThree(int numDisk)
        {
            //adding disk to stack
            temp = numDisk;
            tower = new Stack[4];

            for(int a = 0; a <= 3; a++)
            {
                tower[a] = new Stack<Integer>();
            }

            for (int i = numDisk; i > 0; i--)
            {
                tower[1].push(numDisk);
                show();
            }
            solver(numDisk, 1, 3, 2);
        }

        public static void show()
        {
            //System.out.println("Pillar1: ");
            //System.out.println("Pillar2: ");
            //System.out.println("Pillar3: ");

            String Pillar1 = "Pillar1: ";
            String Pillar2 = "Pillar2: ";
            String Pillar3 = "Pillar3: ";

            for(int x = temp -1 ; x >= 0 ; x--)
            {
                String emptStr1 = "";
                String emptStr2 = "";
                String emptStr3 = "";

                try
                {
                    emptStr1 = String.valueOf(tower[1].get(x));
                }
                catch(Exception e)
                {
                }

                try
                {
                    emptStr2 = String.valueOf(tower[2].get(x));
                }
                catch(Exception e)
                {
                }

                try
                {
                    emptStr3 = String.valueOf(tower[3].get(x));
                }
                catch(Exception e)
                {
                }
                System.out.print(Pillar1+emptStr1+"\n");
                System.out.print(Pillar2+emptStr2+"\n");
                System.out.print(Pillar3+emptStr3+"\n");
                System.out.print("\n");
            }
        }//end show

        public static void solver(int numDisk, int start, int middle, int end)
        {
            if(numDisk > 0)
            {
                try
                {
                    //sorting disks
                    solver(numDisk - 1, start, end, middle);
                    int dis = tower[start].pop(); //move disk top-most disk of start
                    tower[middle].push(dis);
                    show();
                    solver(numDisk - 1, middle, start, end);
                }
                catch(Exception e)
                {
                }
            }
        }

        public static void main(String args[])
        {
            tower[1] = new Stack<Integer>();
            tower[2] = new Stack<Integer>();
            tower[3] = new Stack<Integer>();

            TowersOfHanoiThree(2);
        }
    }



