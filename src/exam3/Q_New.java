package exam3;

public class Q_New {

    public interface I1 {
        int i = 10;
    }


//I2.java


    public interface I2 {
        int i2 = 20;
    }


//I3.java


    public interface I3 extends I1, I2 {


    }


//Test.java



        public static void main(String[] args) {
            System.out.println(I1.i); //Line n2
            System.out.println(I2.i2); //Line n3
            System.out.println(I3.i); //Line n4
            System.out.println(I3.i2); //Line n4
        }
    }


