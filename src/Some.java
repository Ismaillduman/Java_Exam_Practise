
public class Some{
    static int count;
    public static void displayMsg(){
        System.out.println(count);
    }

    public static void main(String[] args) {
        Some.displayMsg();
       displayMsg();


       int i=100;
       float f=100.0f;
       double d=123;
       f=i;
       i=(int)f;
       f=(float) d;
       d=f;
       i=(int)d;
       d=i;
    }
        }