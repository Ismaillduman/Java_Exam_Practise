

abstract class Vehicle3 {
	Vehicle3(){

		System.out.println("Vehicle");
	}
}
class Bus extends Vehicle3{
	Bus(){
		System.out.println("Bus");
	}
}
public class Transport {
	public static void main(String[] args) {

		Vehicle3 v = new Vehicle3() {


		};
	}
}
//What is the result?
//A.	Vehicle 
//		Bus
//B.	Bus
//		Vehicle
//C.	Bus
//D.	The program doesn’t print anything