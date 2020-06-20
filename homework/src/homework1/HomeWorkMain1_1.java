package homework1;

public class HomeWorkMain1_1 {
    public static void main(String[] args) {
        int x = 42;  // 00101010
        int y = 15;  // 00001111
        int z = -42; // 10101010
        int q = -15; // 10001111
        int t, s, a, b, c, d, e, g, f, m, l, p, n, k;

        System.out.println(x + " в двоичном представление = " + Integer.toBinaryString(x));
        System.out.println(y + " в двоичном представление = " + Integer.toBinaryString(y));
        System.out.println(z + " в двоичном представление = " + Integer.toBinaryString(z));
        System.out.println(q + " в двоичном представление = " + Integer.toBinaryString(q)+ "\n");




        System.out.println("Побитовые операторы \n");
        System.out.println("");


        System.out.println("Побитововое И");
        System.out.println(test(x) & test1(y));
        System.out.println("");


        System.out.println("Побитовое И с присваением");
        System.out.println( a = x &= y);
        System.out.println("");


        System.out.println("Побитовое Или");
        System.out.println(test(x) | test1(y));
        System.out.println("");


        System.out.println("Побитовое Или с присваением");
        System.out.println(b = x |= y);
        System.out.println("");


        System.out.println("Побитовый исключающее Или");
        System.out.println(test(x) ^ test1(y));
        System.out.println("");


        System.out.println("Побитовый исключающее Или с присваением");
        System.out.println(c = x ^= y);
        System.out.println("");


        System.out.println("Побитовый сдвиг вправо");
        System.out.println(test(x) >> test1(y));
        System.out.println("");


        System.out.println("Побитовый сдвиг вправо с присвоением");
        System.out.println(d = x >>= y);
        System.out.println("");


        System.out.println("Побитовый сдвиг влево с присвоением");
        System.out.println(e = x <<= y);
        System.out.println("");

        System.out.println("Побитовый сдвиг вправо с заполненением нулями");
        System.out.println(test(x) >>> test1(y));
        System.out.println("");

        System.out.println("Побитовый сдвиг влево");
        System.out.println(test(x) << test1(y));
        System.out.println("");



        // тепеть для отрицательных чисел

        System.out.println("теперь для отрицательных цисел \n");

        System.out.println(test(x) & test1(y));
        System.out.println("");



        System.out.println( a = x &= y);
        System.out.println("");



        System.out.println(test(x) | test1(y));
        System.out.println("");



        System.out.println(b = x |= y);
        System.out.println("");



        System.out.println(test(x) ^ test1(y));
        System.out.println("");



        System.out.println(c = x ^= y);
        System.out.println("");



        System.out.println(test(x) >> test1(y));
        System.out.println("");



        System.out.println(d = x >>= y);
        System.out.println("");



        System.out.println(e = x <<= y);
        System.out.println("");


        System.out.println(test(x) >>> test1(y));
        System.out.println("");


        System.out.println(test(x) << test1(y));
        System.out.println("");



    }

    public static int test (int a){
       return (a);
    }
    public static int test1 (int b){
        return (b);
    }





}






