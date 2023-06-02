
import java.util.ArrayList;
import java.util.List;
public class Frage35 {



        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(100);
            list.add(200);
            list.add(100);
            list.add(200);
           // list.remove(100);

            System.out.println(list);
            String s3 = "OCAJP";
            String s4 = new String("OCAJP");
            System.out.println(s3 == s4);
            String s1 = "OCAJP";
            String s2 = s1.concat("");
            System.out.println(s1 == s2);



        }
    }

