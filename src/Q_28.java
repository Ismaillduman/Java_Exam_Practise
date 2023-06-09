import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_28 {

    public static void main(String[] args) {
        String[] arr = {"Hiss", "Howl", "Arel", "Youl"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if(arrList.removeIf(s -> {System.out.print(s); return s.length() <=2;} )){ // < 2
            System.out.print(" removed");

        }
        System.out.println();
        String x="asdfghj";
        System.out.println(x.substring(5,7));
        //System.out.println(x.substring(5,8));
        StringBuilder c= new StringBuilder("asdfghj");
        System.out.println("==================================");
        System.out.println(c.substring(5,7));
        System.out.println(c.substring(5));

//        arrList.add(null);
//        System.out.println(arrList);
//        arrList.remove(1);
//        System.out.println(arrList);
//        arrList.remove(null);
//        System.out.println(arrList);


        /*Lambda ifadesi her eleman için çalıştırılır. İlk önce eleman System.out.print(s) ile yazdırılır ve
         sonra elemanın uzunluğu (s.length()) 2'den küçük veya eşitse true döner ve eleman kaldırılır.*/
    }
}

