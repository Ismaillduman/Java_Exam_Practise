import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Class2 {

//    public static void main(String [] args) {
//        int a = 3;
//        m(++a, a++);
//        System.out.println(a);
//    }
//
//    private static void m(int i, int j) {
//        i++;
//        j--;
//    }
//public static void main(String[] args) {
//    List<String> dryFruits = new ArrayList<>();
//    dryFruits.add("Walnut");
//    dryFruits.add("Apricot");
//    dryFruits.add("Almond");
//    dryFruits.add("Date");
//    dryFruits.removeIf(dryFruit -> dryFruit.startsWith("A"));
//    for(String dryFruit : dryFruits) {
////        if(dryFruit.startsWith("A")) {
////            dryFruits.remove(dryFruit);
//        System.out.println(dryFruit);
//    }
//
//
//}
private static int [] arr;
    public static void main(String [] args) {
        StringBuilder sb = new StringBuilder("Hello");
        List<StringBuilder> list = new ArrayList<>();
        list.add(sb);
        list.add(new StringBuilder("Hello"));
        list.add(sb);
        sb.append("World!");

        System.out.println(list);
    }


    }

