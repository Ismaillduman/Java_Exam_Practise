package p3;

import p1.A;
import p1.p2.B;

import java.util.ArrayList;
import java.util.List;

public class C {

    String name;

    public C(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        A o1 = new A();

        B o2 = new B();
        o2.doStuff();
        C c = new C("Mike");
        List list = new ArrayList<>();
        list.add(c);
        int f= list.indexOf(c);
        System.out.println(f);
        System.out.println(list
        );
        if(f>=0){
            System.out.println("Mike found");
        }

    }
}
