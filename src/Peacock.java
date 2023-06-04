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



//	/* insert code snippet here */
//  A) Bird p = new Peacock();
//  B) Bird b = new Bird();   Peacock p = (Peacock) b;
  //Peacock b = new Peacock (); Bird p = (Bird) b;
 Bird b = new Peacock ();  Peacock p = (Peacock) b;

			p.fly();
			p.dance();
//Which code snippet can be inserted to print Fly.Dance. ?

			}}
	