

public class Q_022 {

//	public static class Sum{
//		int x;
//	}

	public static void main(String[] args) {
		//int x=10;
		  int ans ;
	 // if it is initialized, for example int ans = 0;  --> Answer 0
		try {
			int num = 10;
			int div = 0;
			ans = num / div;
		} catch (ArithmeticException ae) {
			//System.out.println(ans+" ");												// line n1
		}catch (Exception e) {
			System.out.println("Invalid calculation");
		}


//	System.out.println("Answer = " + ans);	// line n2
		// ans is initialized in the try-catch block, can not be seen outside the block
	}
}
//What is the result?
//A.	Answer = 0
//B.	Invalid calculation
//C.	Compilation fails only at line n1.
//D.	Compilation fails only at line n2.
//E.	Compilation fails at line n1 and line2.
