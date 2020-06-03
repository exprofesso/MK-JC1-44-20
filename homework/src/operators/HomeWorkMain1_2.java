package operators;

public class HomeWorkMain1_2 {

    public static void main(String[] args) {
        int c = 5;
        int f =2;
        int g =8;
        int b = 68;
        int d = 22;
        int e = 7;
        int a;
        int h = 20;
        int m = 6;
        int p = 3;
        int l = 12;
        int t = 119;
        boolean test;


        a = c + f / g; // делим f на d + с. int целое, значение после запятой откидываем.
        System.out.println(a);

        a = (c + f) / g; // складываем с и f, делим на g. int целое, значение после запятой откидываем.
        System.out.println(a);

        a = (c + f++) / g; // делаем инкремент f прибавляем с делим на  g. int целое, значение после запятой откидываем.
        System.out.println(a);

        a = (c + f++) / --g; // делаем инкремент f прибавляем с, делаем дискремент g и делим сковки на g
        System.out.println(a);

        a = (c * f >> f++) / --g; // делаем инкремент f, перемножаем с и f, делаем сдвиг вправо по биту на f. делаем дискремент g и потом делим скобки на g
        System.out.println(a);

        a = (c + e > h ? b : d * f >> f++) / --g; // c + e меньше h поэтому f делаем инкремент далее d * f, производим сдвиг побитовый вправо, делаем дескремент g и делим скобки на g
        System.out.println(a);
/*

            ошибка
        a = (c + e > h ? b => b : d * f >> f++) / --g;
        System.out.println(a);

        a = m - f > p && l * l <= t;
        System.out.println(a);
    */
        test = true && false;
        System.out.println(test);




    }

}
