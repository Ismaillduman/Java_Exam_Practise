package exam_5;

import java.util.ArrayList;
import java.util.List;

public class CharInt {

        private static void m(int i) {
            System.out.print(1);
        }

        private static void m(int i1, int i2) {
            System.out.print(2);
        }

        private static void m(char... args) {
            System.out.print(3);
        }

        public static void main(String... args) {
            m('A');
            m('A', 'B');
            m('A', 'B', 'C');
            m('A', 'B', 'C', 'D');

           final int i7=40;

            short s7=  i7+100;

            short x=7,y=200;
            String[]arr= new String[7];
            System.out.println(arr);

            List<String> list = new ArrayList<>();
            list.add("P");
            list.add("O");
            list.add("T");
            list.add("T");

            List<String> subList = list.subList(1, 3); //Line n1
            subList.set(0, "E"); //Line n2
            subList.set(1, "E");//Line n2
            subList.set(2, "E");//Line n2
            System.out.println(list);
        }
}
