public class Q_27 {
    public int amount;

//    public Q_27() {
//     amount = 100;
//    }
//    public Q_27() {
//        this.amount = 100;
//    }

    public static void main(String[] args) {
        Q_27 q27 = new Q_27();
        //q27.amount=100;
        q27.amount=100;
        System.out.println(q27.amount);
    }
}

/*
 * 		Which three pieces of code, when inserted independently, set the value of amount to 100?

 	A. At line n1 insert:
 		public CheckingAccount(){
 		amount = 100;
 		}

 	 B. At line n2 insert:
 		this.amount = 100;   			// ==>Cannot use this in a static  context

 	 C. At line n2 insert:
 		amount = 100;					// ==> Cannot make a static reference to the non-static field amount

 	 D. At line n1 insert:
 		public CheckingAccount(){
 		this.amount = 100;
 		}

 	 E. At line n2 insert:
 		acc.amount = 100;

 	 F. At line n1 insert:
 		public CheckingAccount(){
 		acc.amount = 100;				// ==> acc cannot be resolved to a variable
 		}

 */
/*"Cannot make a static reference to the non-static field amount" is a common error message in Java that occurs
 when you try to access an instance (non-static) field or method from a static context.

In Java, static members (fields and methods) belong to the class itself, while instance members
belong to individual objects or instances of the class.
When you try to access an instance field or method from a static context (such as a static method or a static block),
 the Java compiler doesn't know which object's instance variable you are referring to
 because there is no specific instance of the class to reference.

For example, consider the following Java code:

arduino
Copy code
public class MyClass {
    private int amount;

    public static void main(String[] args) {
        amount = 10; // Error: Cannot make a static reference to the non-static field amount
    }
}
In this example, we have a class MyClass with an instance field amount and a static method main.
In the main method, we are trying to set the value of the amount field, but we get an error message saying
"Cannot make a static reference to the non-static field amount".

To fix this error, we need to create an instance of the class and access the amount field through that instance,
 like this:

arduino
Copy code
public class MyClass {
    private int amount;

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.amount = 10; // OK
    }
}
In this updated code, we create an instance of MyClass and store it in the variable obj.
Then, we access the amount field through the obj instance, which resolves the error.
* */


