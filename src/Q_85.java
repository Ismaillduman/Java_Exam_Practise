


	class MyException extends RuntimeException {}

	    public class Q_85 {


	    	public static void main(String[] args) {

	            try {
	                method1();
	            }
	            catch (MyException ne) {
	                System.out.print("A");
	            }
	        }

	        public static void method1() {//throws RuntimeException {// line n1
	            try {
	                throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
	            }
	            catch (RuntimeException e) {
	                System.out.print("B");
	            }
	        }

	    }

	//What is the result?
	//A. A
	//B. B
	//C. Either A or B
	//D. A B
	//E. A compile time error occurs at line n1
	
	    


