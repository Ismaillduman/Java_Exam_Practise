

class Vehicle1{
	String type="4W" ;
	int maxSpeed =100;
	
	Vehicle1(String type, int maxSpeed){
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
	Vehicle1(){}
}
 class Car1 extends Vehicle1 {
	String trans;
	
	Car1(String trans){
		//super("",2);
		// line n1

		this.trans = trans;
	}
	Car1(String type, int maxSpeed, String trans){
		super(type, maxSpeed);	// line n2
		this.trans=trans;
	}
	public static void main(String[] args) {
		Car1 c1 = new Car1("Auto");
		Car1 c2 = new Car1("4W",  150, "Manual")	;
		System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
		System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
	}
}
//What is the result?
//A.	4W 100 Auto
//		4W 150 Manual
//B.	null 0 Auto
//		4W 150 Manual
//C.	Compilation fails only at line n1
//D.	Compilation fails only at line n2
//E.	Compilation fails at both line n1 and line n2

/*Vehicle1 sınıfında bulunan boş constructor (parametresiz constructor), başka bir constructor
çağrılmadığı durumlarda kullanılır. Bu durumda, Vehicle1 sınıfından türetilen sınıflarda bir constructor çağrıldığında,
 eğer o constructor içinde super() ifadesi yer almazsa, varsayılan olarak boş constructor çağrılır.

Örnekte, Car1 sınıfının Car1(String trans) constructor'ı içinde super() ifadesi yer almamaktadır. Bu durumda,
 Car1 sınıfının nesnesi oluşturulduğunda Vehicle1 sınıfının boş constructor'ı otomatik olarak çağrılır.
 Bu sayede type ve maxSpeed alanlarına varsayılan değerler atanır.

Eğer Vehicle1 sınıfında boş constructor olmasaydı ve
Car1 sınıfında herhangi bir constructor içinde super() ifadesi kullanılmasaydı,
Car1 sınıfının herhangi bir constructor'ı çağrıldığında hata alırdık.
 Bu yüzden, sınıfları türetirken üst sınıfın constructor'larına uygun şekilde çağırma işlemi önemlidir ve
  boş constructor, bu durumda bir varsayılan değer sağlamak için kullanılabilir.*/