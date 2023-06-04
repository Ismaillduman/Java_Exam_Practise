public class Q_190 {


    class E1 extends Exception { //problem verir
    }

    class E2 extends RuntimeException {//problem vermez
    }


        public void m1() throws E1 {
            System.out.println("m1.Accessed.");
            throw new E1();
        }

        public void m2() throws E1 { // You can throw any exception here to solve the problem.

           m1();
                System.out.println("m2.Accessed.");
                throw new E2();

        }

        public static void main(String[] args) throws E1 { // starts to read codes from main method
            int level = 1;                            // ONLY CHANGE
            Q_190 obj = new Q_190();
            if (level <= 5 && level >= 3) { // ==> true now!!
                obj.m1();// ==> executed -- causes compilation error
            } else {
                obj.m2();
            }
        }// then m1 method causes exception
    }
//
///*
//*
//Which statement is true?
//A. The program prints m1.Accessed.
//B. The program fails compile due to the unhandled E1 exception.
//C. The program prints m2.Accessed.
//D. The program fails to compile due to the unhandled E2 exception.
//*
//Answer: C, D
// */

