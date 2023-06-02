import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

class Student2 {

        String name;
        int age;

        void Student2() {
            Student2("James", 25);
        }

      void Student2(String name, int age) {
            this.name = name;
            this.age = age;
        }

    }

    public class Test9 {
        private static void m1() throws Exception { //Line 6
            System.out.println("NOT THROWING ANY EXCEPTION"); //Line 7
        }

        char var1;
        double var2;
        float var3;
        public static void main(String[] args) {

            Test9 obj = new Test9();
            System.out.println(">" + obj.var1);
            System.out.println(">" + obj.var2);
            System.out.println(">" + obj.var3);

           // m1();
            Student2 s = new Student2();
            Student2 sd= new Student2();
            System.out.println(s.name + ":" + s.age);

            int [] arr = {2, 1, 0};
            for(int i : arr) {
                System.out.println(arr[i]);
            }

            List<Integer> list = new ArrayList<Integer>();
            list.add(new Integer(2));
            list.add(new Integer(1));
            list.add(new Integer(0));

            list.remove(list.indexOf(0));

//            System.out.println(list);
//            System.out.println("==============================================");
//            String[] names = { "Smith", "Brown", "Thomas", "Taylor", "Jones" };
//            List<String> list2 = new ArrayList<>();
//            for (int x = 0; x < names.length; x++) {
//                list2.add(names[x]);
//                switch (x) {
//                    case 2:
//                        continue;
//                }
//                break;
//            }
//            System.out.println(list2.size());
//
//            short arr5 [] = new short[2];


            do {
                System.out.println(100);
            } while (false);
            System.out.println("Bye");

            double price = 90000;
            String model="";
            if(price > 100000) {
                model = "Tesla Model X";
            } else if(price <= 100000) {
                model = "Tesla Model S";
            }
            System.out.println(model);

            System.out.println("===================");
            String s2 = new String("Hello");
            List<String> list6 = new ArrayList<>();
            list6.add(s2);
            list6.add(new String("Hello"));
            list6.add(s2);
            s2.replace("l", "L");

            System.out.println(list6);

            LocalDate date = LocalDate.parse("1947-08-14");
            LocalTime time = LocalTime.MAX;
            System.out.println(date.atTime(time));


            List<Character> list8 = new ArrayList<>();
            list8.add(0, 'V');
            list8.add('T');
            StringBuilder sb = new StringBuilder(100);
            System.out.println(sb.length() + ":" + sb.toString().length());



            List<LocalDate> dates = new ArrayList<>();
            dates.add(LocalDate.parse("2018-07-11"));
            dates.add(LocalDate.parse("1919-02-25"));
            dates.add(LocalDate.of(2020, 4, 8));
            dates.add(LocalDate.of(1980, Month.DECEMBER, 31));

            dates.removeIf(x -> x.getYear() < 2000);

            System.out.println(dates);
        }
        }

