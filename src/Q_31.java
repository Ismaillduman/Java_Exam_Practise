package oca_2022.q031;

public class Q_31 {

	public static void main(String[] args) {	
		int array1 [] = {1, 2, 3};  		// 1 2 3
		int array2 [] = new int[5]; 	// 0 0 0 0 0 

		array2 = array1;// 1 2 3  burada array2 ögeleri kaybolur array1 olusur   (not 1 2 3 null null)

		//int[] kaynakDizi = {1, 2, 3, 4, 5};
		//int[] hedefDizi = new int[5];
		//System.arraycopy(kaynakDizi, 0, hedefDizi, 0, 5);

		for (int i : array2) {
			System.out.print(i + " ");
		}
		System.out.println();
		int array3 [] = new int[3];
		array3 = array2; 					// 1 2 3
		
		for (int i : array3) {
			System.out.print(i + " ");
		}
	}
}
//What is the result?
//A.	1 2 3 0 01 2 3 0 0
//B.	An Exception is thrown at run time.
//C.	1 2 3 0 01 2 3
//D.	1 2 31 2 3