

public class Q_74 {

	void readCard(int cardNo) throws Exception{
		System.out.println("Reading Card");
	}
	void checkCard(int cardNo) throws RuntimeException{
		System.out.println("Checking Card");
	}


	public static void main(String[] args) throws Exception {
		Q_74 ex = new Q_74();

		int cardNo=12344;
		ex.readCard(cardNo);
		ex.checkCard(cardNo);
		}
		

		//answer 0 2 4 6
		//second version
		
		
//			for(ii=0;ii<jj-1;ii+=2) { // 7-1 =jj=6 6 dan kucuk olmadigi icin 6 yi yazdirmaz
//				System.out.print(ii+" ");
//			}
		}




//answer 0 2 4

