package workbook;

public class TaskMain2 {
    public static void main(String[] args) {
        int s = 3750005;
        int sec;
        int m;
        int min, h;
        int hour, d;
        int day, w;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hour = h % 24;
        d = (h - hour) / 24;
        day = d % 7;
        w = (d - day) / 7;

        System.out.println(w + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд ");
    }
}
