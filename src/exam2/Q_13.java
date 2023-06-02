package exam2;

import java.util.ArrayList;
import java.util.List;

public class Q_13 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(new Integer(100));
       // list.remove(100); exception

        System.out.println(list);
    }
}
