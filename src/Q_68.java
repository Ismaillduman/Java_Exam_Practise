package oca_2022.q068;


	import java.io.IOException;
	import java.text.ParseException;

class MyException extends RuntimeException {}
	
	public class Q_68{
	
	        public static void main (String[] args) {
//	            try {
//	                method1();
//	            }
//	                catch(MyException ne){
//	                    System.out.print("A");
//	                }
//	            }
//
//	            public static void method1(){ // line n1
//	                try {
//	                    throw 3 > 10 ? new MyException():new IOException();
//	                } catch (IOException ie) {
//	                    System.out.println("I");
//	                } catch (Exception ne) {
//	                    System.out.print("B");
//	                }

				try {
					try {
						throw 3 <10 ? new IOException() : new MyException();
					} catch (IOException ie) {
						System.out.println("I");
					} catch (MyException me) {
						System.out.print("B");
					} catch (Exception e) {
						System.out.println("C");
					}
				} finally {

				}
			}

		public static void method1() { // line n1

//
            }
	        }

	         //What is the result?
	        //A. A
	        //B. AB
	       //C. A compile time error occurs at line n1.
	       // D. B
	       //E. I
	       // Answer: E


	//second way:

//	        try {
//	            method1();
//	        }
//	        catch(MyException ne){
//	            System.out.print("A");
//	        }
//	    }

//	    public static void method1(){ // line n1
//	        try {
//	            throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
	//
//	        } catch (RuntimeException re) {
//	            System.out.print("B");
//	        }
	//
//	    }
	//}

	// Answer: B
	//
	//
//	        third way:
//	         catch (RuntimeException re) {
//	            System.out.print("I");
//	        }
	//
//	    }
	//}
	// Answer: "I"
	
