

public class Employee1 {
	String name;
	boolean contract;
	double salary;
	 Employee1() {
		//line1
		name="Joe";
		contract=true;
		salary=100.0f;
//		this.name = new String("Joe");
//		this.contract = new Boolean(true);
//		this.salary = new Double(100);
	}
	public String toString() {
		return name + ":" + contract + ":" + salary;	
	}	
	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		Employee1 e2 = new Employee1();
		Employee1 e3 = new Employee1();

		e1=e3;
		e3=e2;
		e2=null;
		// line2
		//e.name="elif";
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println("==========================");
		StringBuilder x= new StringBuilder();

		System.out.println(x);
		System.out.println(new StringBuilder("java"));

		System.out.println("===================================================");
		int[][] array= new int[2][2]; //length 2
		array[0][0]=1;
		array[0][1]=2;
		array[1][0]=3;
		array[1][1]=4;


		for (int i = 0; i <2; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println(array[i][j]);
			}
		}
	}
}
/* 
  Which two modifications, when made independently, enable the code to print joe:true:100.0 ? ( Choose Two)
 * Output w/o any change ==> null:false:0.0 

  		A: Replace line2 with:
		 	e.name = "Joe";
		 	e.contract = true;
			e.salary = 100;
			
		B: Replace line2 with:
		 	this.name = "Joe";  		// this. cannot be  used in static content / main method
		 	this.contract = true;
			this.salary = 100;
		 
		 C: Replace line n1 with:
			this.name = new String("Joe");
			this.contract = new Boolean(true);
			this.salary = new Double(100);
			
		D: Replace line n1 with: (was n2 in earlier versions, non-static fields can not be called under static methods)
		 	name = "Joe";
		 	contract = TRUE;  		// --> TRUE gives complitaion error
			salary = 100.0f;
			
		E: Replace line n1 with:
			this("Joe", true, 100);  	// could be used to call a constructor w/ 3 parameters
		
* 'toString()' method : Object class'inda zaten oldugu icin bu methodu yazdigimizda override goruruz ve
  her object olusturdugumuzda bu method calisir. Aslinda override etmeyince zaten memory'deki yerini gosterir.  	
		
		
		
		
		
		
*/
