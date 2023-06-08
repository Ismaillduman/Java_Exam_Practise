package exam_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

interface X1 {
    default void print() {
        System.out.println("X1");
    }
}
 
interface X2 extends X1 {
    void print();
}
 
interface X3 extends X2 {
    default void print() {
        System.out.println("X3");
    }
}
 
class X5 implements X3 {}
 
public class Test {
    public static void main(String[] args) {
        X5 obj = new X5();
        obj.print();


        boolean flag = false;
        System.out.println((flag = true) | (flag = false) || (flag = true));
        System.out.println(flag);
        List<Integer> list = new ArrayList<>();
        byte b = 10;
        list.add((int) b); //Line n1
        int mul = list.get(0) * list.get(0); //Line n2
        System.out.println(mul);
        LocalDate date = LocalDate.parse("1983-06-30");
        System.out.println(date.plusMonths(8));
    }

}