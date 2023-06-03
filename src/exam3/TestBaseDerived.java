package exam3;

import java.util.ArrayList;
import java.util.List;

class Q_62 {
     public static void main(String[] args) {
         String fruit = new String(new char[] {'M', 'a', 'n', 'g', 'o'});
         System.out.println(fruit);
         int [] arr1 = {5, 10, 15};
         int [] arr2 = {'A', 'B'};
         arr1 = arr2;
         System.out.println(arr1.length + arr2.length);

         List<String> trafficLight = new ArrayList<>();
         trafficLight.add(0, "RED");
         trafficLight.add(1, "RED");
         trafficLight.add(2, "ORANGE");
         trafficLight.add(3, "GREEN");

      trafficLight.remove(Integer.valueOf(1));
         System.out.println(trafficLight);
     }

        protected void m1() {
            System.out.println("Base: m1()");
        }
    }

    class Derived extends Q_62 {
        public void m1() {
            System.out.println("Derived: m1()");
        }
    }

    public class TestBaseDerived {
        public static void main(String[] args) {
            Q_62 b = new Derived();
            b.m1();
        }
    }

