package q121;

public class MainTest {

	public static void main(int[] args) {
		System.out.println("int main " + args[0]);
	}
	public static void main(Object[] args) {
		System.out.println("Object main " + args[0]);
	}
	public static void main(String[] args) {
		System.out.println("String main " + args[0]);
		Short s1=100;
		Byte b= 50;
		Integer s2=400;
		Long s4= (long) s1+s2;
		//Byte b1=(Byte)s1;
		//Short s=(Short)b; Byte to Short not possible
		Short s=(short)b; //Byte to short
		//Short s6= (Short)s2;
		//Long s5=  s1+s2;
		float d=(float)s1+s2;
		float d2=s1+s2;
		double f=(double)s1+s2;
		double f2=s1+s2;
		Integer i=(int) f;


		System.out.println(s4);
		System.out.println(d);

	}

}