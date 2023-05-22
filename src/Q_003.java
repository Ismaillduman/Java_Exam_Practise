import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q_003 {
    public static void main(String[] args) {
        try {
            String date= LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
            System.out.println(date);

        }catch(RuntimeException e){
            System.out.println("Hi from catch");
            e.printStackTrace();
        }

    }
}
