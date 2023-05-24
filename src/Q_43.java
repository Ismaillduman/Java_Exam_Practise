import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_43 {
    public static void main(String[] args) {
//        String[] arr = {"Hi", "How", "Are", "You"};
//        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
//        if(arrList.removeIf((String s) -> { return s.length() <=2; })) {
//            String removed = s + " removed"; //out of lamda expression can not be able to reach s
//            System.out.println(removed);
//        }

        String[] arr = {"Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if(arrList.removeIf((String s) -> { return s.length() <=2; })) {
            String removed = "";
            for (String s : arrList) {
                removed += s + " ";
            }
            removed += "removed";
            System.out.println(removed);
        }
    }

}
