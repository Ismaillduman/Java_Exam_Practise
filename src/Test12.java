import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Test12 {
    public static void main(String[] args) {
        Student12 Student12 = new Student12("James", 25);
        int marks = 25;
        review(Student12, marks);
        System.out.println(marks + "-" + Student12.marks);
        String h="asd"+"";

        LocalDateTime obj = LocalDateTime.now();
        System.out.println(obj.getSecond());

        Period period = Period.of(0, 0, 0);
        System.out.println(period);

        LocalTime time = LocalTime.of(16, 40);
        String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "PM" : "AM":"";
        System.out.println(amPm);


        int [] arr3[]= new int[8][];
    }

    private static void review(Student12 stud, int marks) {
        marks = marks + 10;
        stud.marks += marks;

        byte var = 100;
    }
}
