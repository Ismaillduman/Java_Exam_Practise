package exam2;

import java.util.SplittableRandom;

public class Q_58 {

    static Double d1=12.5;
    static int x=d1.intValue();


    public static void main(String[] args) {
        char c = 'Z';
        long l = 100_00l;
        int i = 9_2;
        float f = 2.02f;
        double d = 10_0.35d;
        l = c + i;
        f = c * l * i *f;
        f = l + i + c;
        i = (char)d;
        f = (long) d;
        String str= "Java Rocks!";;;;;;;;;;;;;;;;;;;;;
        System.out.println(str.length()+":"+str.charAt(10));
    }
}
