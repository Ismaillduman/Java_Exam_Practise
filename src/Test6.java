import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test6 {//123 v14
	int a1;
	public static void doProduct(int a) {
		a = a * a;
	}
	public static void doString(String s) {
		String a=s.concat(" " + s);
		s=a;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Test6 item = new Test6();
		item.a1 = 11;
		String sb = new String("Hello");
		Integer i = 10;
		doProduct(i);
		doString(sb);
		doProduct(item.a1);
		System.out.println(i+ " " + sb + " " + item.a1);
		LocalDateTime dt= LocalDateTime.of(2014,2,21,1,1,1);
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
	}
}
//What is the result?
//A.	10 Hello Hello 11
//B.	10 Hello Hello 121
//C.	100 Hello 121
//D.	100 Hello Hello 121
//E.	10 Hello 11