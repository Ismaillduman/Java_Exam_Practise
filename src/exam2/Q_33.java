package exam2;

import java.util.ArrayList;
import java.util.List;
public class Q_33 {
 

   
        private String name;
        private int age;

        Q_33(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return "Q_33[" + name + ", " + age + "]";
        }

//        public boolean equals(Object obj) {
//            if(obj instanceof Q_33) {
//                Q_33 stud = (Q_33)obj;
//                if(this.name.equals(stud.name) && this.age == stud.age) {
//                    return true;
//                }
//            }
//            return false;
//        }
    }

    class Test25 {
        public static void main(String[] args) {
            List<Q_33> Q_33s = new ArrayList<>();
            Q_33s.add(new Q_33("James", 25));
            Q_33s.add(new Q_33("James", 27));
            Q_33s.add(new Q_33("James", 25));
            Q_33s.add(new Q_33("James", 25));

            Q_33s.remove(new Q_33("James", 25));

            for(Q_33 stud : Q_33s) {
                System.out.println(stud);
            }
        }
    }

