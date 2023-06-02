import java.util.ArrayList;
import java.util.List;

public class NewQuestions {


        static {
            //System.out.println(1/0);
        }



    static public   void  main(String[] args2) {
        System.out.println("HELLO");
        String str1 = new String("Core");
        String str2 = new String("CoRe");
        System.out.println(str1 = str2);
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("D");

        List<String> list2 = new ArrayList<>();
        list2.add("B");
        list2.add("C");

        list1.addAll(1, list2);

        System.out.println(list1);

        System.out.println("=================================");
        //Integer var= 7;
        Character var= '7';
        switch(var) {
            case 7:
                System.out.println("Lucky no. 7");
                break;
            default:
                System.out.println("DEFAULT");
        }

        System.out.println("===========================");
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        String s2 = sb.toString();

        System.out.println(s1 == s2);

        short [] args = new short[]{50, 50};
        args[0] = 5;
        args[1] = 10;
        System.out.println("[" + args[0] + ", " + args[1] + "]");

        double [] arr = new double[2];
        System.out.println(arr[0] + arr[1]);
    }
}
