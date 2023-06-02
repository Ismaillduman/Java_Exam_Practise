package exam2;

import java.util.ArrayList;
import java.util.List;

class Q_5 {
     public static void main(String[] args) {
         List<String> list = new ArrayList<>();
         list.add(null);
         list.add(null);
         list.add(null);
         System.out.println(list.remove(0) + ":" + list.remove(null));
         //list remove(int) cikarilan degeri return ederken list.remove(object) true yada false döner
         // eger obje kaldirilabiliyorsa true yoksa false

//         int[] arr={0};
//         Integer[] arr2={null,null,null};
//         for (Integer i : arr2) {
//             i+=3;
//             System.out.println(i);
//         }

     }
}
