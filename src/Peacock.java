import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class Bird {
	public void fly() {
		System.out.println("Fly.");
	}
}

	public class Peacock extends Bird {
		public void dance() {
			System.out.println("Dance.");
		}
		
			public static void main(String[] args) {

				LocalDate date2 = LocalDate.of(2020, 9, 30);
				System.out.println(date2);

				LocalDate date = LocalDate.of(2012, 1, 11);
				Period period = Period.ofMonths(2);
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
				System.out.print(formatter.format(date.minus(period)));

			double[] ar= new double[4];
				System.out.println(ar[0]);
				Float f=100.2f;
				Float f6=100.2F;
				Float f5=(float) 100.2;
				//Float f7=(Float) 100.2;
				float f2=12.2F;
				float f3=(float) 12.2;
				float fl=10;

				//float f4=(Float) 12.2;

				Long ll=(long)1245678;
				//Long l2=1245678;
				long l=1245678;

//	/* insert code snippet here */
//    Bird p = new Peacock(); //dance gelmiyor
//  Bird b = new Bird();   Peacock p = (Peacock) b;//Bird cannot be cast to q177.Peacock
//	//at q177.PeacockS
// Peacock b = new Peacock (); Bird p = (Bird) b;
//
             Bird b = new Peacock ();
			 Peacock p = (Peacock) b;
			p.fly();
			p.dance();


//answer D
	//Which code snippet can be inserted to print Fly.Dance. ?

			}}
	