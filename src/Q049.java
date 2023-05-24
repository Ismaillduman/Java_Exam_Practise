

public class Q049 {

	public static void main(String[] args) {

		//double y1 = 203.22; float fit = y1; //Type mismatch: cannot convert from double to float

		float fit1 = (float) 1_11.0;
		//Float fit2  =   100.00; 						// Type mismatch: cannot convert from double to Float

		int y2 = 100; float fit3= (float)y2;

		float fit4 = 100.00F;


		int n [] [] = {{1, 3}, {2, 4}};
		for(int i = n.length-1; i >= 0; i--) {

			for (int y : n[i]) {
				System.out.print(y);
			}
		}
	}
}

//What is the result?
//A.	1324
//B.	2313  // 2413
//C.	3142
//D.	4231