package exam_5.aritmetikException;

public class Arithmetic {
    private static void div(int i, int j) throws Exception {
        try {
            System.out.println(i / j);
        } catch(ArithmeticException e) {
            Exception ex = new Exception(e);
            throw ex;
        }
    }
    public static void main(String[] args) {
        try {
            div(5, 0);
        } catch(Exception e) {
            System.out.println("END");
        }
        int i = 0;
        for(System.out.print(i++); i < 2; System.out.print(i++)) {
            System.out.print(i);
        }
        int x=5_______________0;
        float f=123.45_58f;
        double d=1_2_3_4;

    }
}
