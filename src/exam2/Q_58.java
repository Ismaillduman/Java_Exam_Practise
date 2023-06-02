package exam2;

public class Q_58 {
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
    }
}
