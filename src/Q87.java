package oca_2022.q087;


public class Q87 {

}
class MarkList{
    int num ;
    public static void graceMarks(MarkList obj4){

        obj4.num += 10;
    }

        public static void main(String[] args) {
            MarkList obj1 = new MarkList();
           // MarkList obj5 = new MarkList();
            MarkList obj2 = obj1;
            MarkList obj3 = null;
            obj2.num = 60;
           // obj5.num = 80;
            graceMarks(obj2);
           System.out.println(obj2);


           Integer s2=400;
            Short s1= 200;
            String s9= (String) s1;
           Long s3= (long)s1+s2;


           short s4=200;
           int s5=400;
           long s6= s4+s5;

        }
    }

    /*
    How many MarkList instances are created in memory at runtime?
    A. 1
    B. 2
    C. 3
    D. 4
    Answer: A
     */
