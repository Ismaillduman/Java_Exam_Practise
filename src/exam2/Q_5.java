package exam2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Q_5 {
//     public static void main(String[] args) {
//         List<String> list = new ArrayList<>();
//         list.add(null);
//         list.add(null);
//         list.add(null);
//         System.out.println(list.remove(0) + ":" + list.remove(null));
//
//         LocalDate date1 = LocalDate.parse("1980-03-16");
//         LocalDate date2 = LocalDate.parse("1980-03-16");
//         System.out.println(date1.equals(date2) + " : " + date1.isEqual(date2));
//         //list remove(int) cikarilan degeri return ederken list.remove(object) true yada false döner
//         // eger obje kaldirilabiliyorsa true yoksa false
//
////         int[] arr={0};
////         Integer[] arr2={null,null,null};
////         for (Integer i : arr2) {
////             i+=3;
////             System.out.println(i);
////         }
//
//     }
private static String s;



    public static void main(String[] args) {
        //add(10.0, new Double(10.0));

        final boolean flag ; //= false;
        flag= false;
        while(flag) {
            System.out.println("Good Morning!");}

        try {
            System.out.println(s.length());
        } catch( NullPointerException ex ) {
            System.out.println("DONE");
        }

        int i;
        outer:
        do {
            i = 5;
            inner:
            while (true) {
                System.out.println(i--);
                if (i == 4) {
                    break outer;
                }
            }
        } while (true);

int var= '7';
        switch(var) {
            case '7':
                System.out.println("Lucky no. 7");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
    }

