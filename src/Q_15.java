public class Q_15 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Duke");
        System.out.println(sb1.toString());
        String str1 = sb1.toString();
        /* insert code here*/
//        String str2 = sb1.toString();
        //String str2 = str1; // the objects are equalized
        str1="Duke";
        String str2 = "Duke";
        System.out.println(str1 == str2); // == checks if the objects are equal, not their values
        System.out.println("=====================================================");
        String a="abc";
        String b= a;
        String c="abc";
        String d= new String("abc");

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);
        System.out.println(d==c);
    }
}
