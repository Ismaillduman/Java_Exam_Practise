import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q_16 {
    String name;

    public Q_16(String name) {
        this.name = name;
    }

    public static void main(String[] args) {


        Q_16[]arr= new Q_16[3];
        arr[1]=new Q_16("ha");
        for (Q_16 i : arr) {
           // System.out.println(i.name);
        }

        Object[]arr2= new Object[3];
        arr2[2]="3";
        for (Object i : arr2) {
           // System.out.println(i.toString());
        }
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
