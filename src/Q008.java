

public class Q008 {

	public static void main(String[] args) {	
		String [] [] arr = {{"A", "B", "C"}, {"D", "E"}};	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " " );
				if (arr[i][j].equals("B")) {

					continue; //bir etkisi yok
				}



			}

			 //etkisi yok
		}
		String x="asdf";
		String y="aklökölö";
		StringBuilder s= new StringBuilder(x);
		System.out.println(s.append(y, 3,8));
		//continue;
	}
}
//What is the result? 
//A.    A B C
//B.	A B C D E right
//C.	A B D E
//D.	Compilation fails.


//continue; cannot be used outside of a loop
//break; can not be be used outside of a loop or switch statement