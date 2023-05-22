import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q_16 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2014, 7, 31,1,1);
      dt.plusDays(30);  // not assigned to dt, no effects on dt
      dt.plusMonths(1);// not assigned to dt, no effects on dt
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME)); //2014-07-31
        /*
        * LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
      dt= dt.plusDays(30);  //  assigned to dt,  effects on dt
      dt= dt.plusMonths(1);//  assigned to dt,  effects on dt
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
        * 2014-09-30
        * */
    }
}
