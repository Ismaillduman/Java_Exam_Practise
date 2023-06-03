package exam3;

import java.time.LocalDate;

public class Q_2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2018-06-06");
        date.minusDays(10);
        System.out.println(date);
        System.out.println("==========");
        System.out.println( date.minusDays(10));
    }
}
