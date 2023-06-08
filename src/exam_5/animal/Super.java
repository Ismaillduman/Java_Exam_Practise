package exam_5.animal;

import java.util.ArrayList;
import java.util.List;

public interface Super {
    String name = "SUPER"; //Line n1
}


//Sub.java

 
class Sub implements Super { //Line n2
 
}


//Test.java

 
class Test8 {
    public static  void main(String... args) {
        Sub sub = null;
        System.out.println(sub.name); //Line n3
        List<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("AAA")); //Line n1
        list.add(new StringBuilder("BBB")); //Line n2
        list.add(new StringBuilder("AAA")); //Line n3

        list.removeIf(sb -> sb.equals(new StringBuilder("AAA"))); //Line n4
        System.out.println(list);

        String [][] arr = { {"%", "$$"}, {"***", "@@@@", "#####"}};
        for(String [] str : arr) {
            for(String s : str) {
                System.out.println(s);
//                if(s.length() == 4) //Line n1
//                    break; //Line n2
            }
            break; //Line n3
        }
    }
}