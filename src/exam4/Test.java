package exam4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class A {
    A() {
        this(1);
        System.out.println("M");
    }

    A(int i) {
        System.out.println("N");
    }
}

class B extends A {

}

public class Test {
    public static void main(String[] args) {
        new B();
    }
}