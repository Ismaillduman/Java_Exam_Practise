package exam2;
import java.util.ArrayList;
import java.util.List;
public class Q_48 {



        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("ONE");
            list.add("TWO");
            list.add("THREE");
            list.add("THREE");

            if(list.remove("THREE")) {
                list.remove("THREE");
            }

            System.out.println(list);
            //System.out.println(null);
            boolean b= new Boolean("True");
            //boolean v= True;
            System.out.println(b);
        }
    }

