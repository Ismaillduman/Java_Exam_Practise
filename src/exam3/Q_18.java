package exam3;

public class Q_18 {
    public static void main(String[] args) {
        String str = "Good"; //Line 3
        str= change(str);//Line 4
        System.out.println(str); //Line 5
    }

    private static String change(String s) {
        return s.concat("_Morning"); //Line 9
    }
}
