package exam3;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Q_13 {
//    private static void m1() {
//        System.out.println(1/0);
//    }
static Boolean[] arr = new Boolean[1];
//    public static void main(String[] args) throws FileNotFoundException {
////        try {
////            m1();
////        } finally {
////            System.out.println("A");
////        }
//        ///System.out.println(1);
//        List<Integer> list = new ArrayList<>();
//        list.add(100);
//        list.add(7);
//        list.add(50);
//        list.add(17);
//        list.add(10);
//        list.add(5);
//
//        list.removeIf(a -> a % 10 == 0);
//
//        System.out.println(list);
//
//        List<String> list2 = new ArrayList<>();
//        list2.add(0, "Array");
//        list2.set(0, "List");
//
//        System.out.println(list2);
//
//        StringBuilder sb = new StringBuilder("SpaceStation");
//        sb.delete(5, 6).insert(5, " S").toString().toUpperCase();
//        System.out.println(sb);
//
//        LocalDate date = LocalDate.of(2000, Month.JANUARY, 1);
//        Period period = Period.parse("p-30000y");
//        System.out.println(date.plus(period));
//
////        if(arr[0]) {
////            System.out.println(true);
////        } else {
////            System.out.println(false);
////        }
//        List<Boolean> list3 = new ArrayList<>();
//        list3.add(true);
//        list3.add(new Boolean("tRue"));
//        list3.add(new Boolean("abc"));
//
//        if(list3.remove(new Boolean("tRue"))) {
//            list3.remove(1);
//        }
//
//        System.out.println(list3);
//        int $ = 80000;
//        String msg = ($ >= 50000) ? "Good bonus" : "Average bonus";
//        System.out.println(msg);
//
//        int x = 2;
//        switch (x) {
//
//            case 1:
//                System.out.println("x is equal to 1");
//                break;
//            default:
//                System.out.println("Still no idea what x is");
//            case 2:
//                System.out.println("x is equal to 2");
//
//
//            case 3:
//                System.out.println("x is equal to 3");
//                break;
//        }
//
//        int a = 20;
//        int var = --a * a++ + a-- - --a;
//        System.out.println("a = " + a);
//        System.out.println("var = " + var);
//    }
public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    list.add(110);
    list.add(new Integer(110));
    list.add(110);

    list.removeIf(i -> i == 110);
    System.out.println(list);
    m(1);

    final int i1 = 1;
    final Integer i2 = 1;
    final String s1 = ":ONE";

    String str1 = i1 + s1;
    String str2 = i2 + s1;

    System.out.println(str1 == "1:ONE");
    System.out.println(str2 == "1:ONE");
//    byte[] arr= new byte[0];
//    System.out.println(arr[0]);

    List<String> fruits = new ArrayList<>();
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("grape");
    fruits.add("mango");
    fruits.add("banana");
    fruits.add("grape");

    if(fruits.remove("grape"))
        fruits.remove("papaya");

    System.out.println(fruits);
    LocalDate date = LocalDate.of(2020, 9, 6);
    System.out.println(date);
    StringBuilder sb = new StringBuilder(5);

    sb=new StringBuilder("0123456789");
    sb.delete(8, 1000);
    System.out.println(sb);
}

    private static void m(Object obj) {
        System.out.println("Object version");
    }

    private static void m(Number obj) {
        System.out.println("Number version");
    }

    private static void m(Double obj) {
        System.out.println("Double version");
    }


}
