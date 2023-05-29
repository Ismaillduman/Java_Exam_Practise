import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyStringTest {
    public static void main(String[] args) {
        System.out.println(new StringBuilder("h"));
        System.out.println(new MyString("h"));

        StringBuilder sb= new StringBuilder(5);
        String s="";
        System.out.println(sb.toString());
        System.out.println(sb.toString().equals(s.toString()));
        LocalDateTime dt= LocalDateTime.of(2014,2,25,1,1);
        System.out.println(dt);
        LocalDate date= LocalDate.parse("2014-06-20",DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }
}
