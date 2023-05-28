
public class Some2{
  String name;
  int age;

    public static void main(String[] args) {
        String s1 = new String("A");
        String s2 = new String("B");
        String s3 = new String("C");

        s1 = s2;
        s2 = s3;
        s3 = s1;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String a="Moon";
        String b= new String("Moon");
        if(a.equals(b)&&a==b){
            System.out.println("True");
        }else{
            System.out.println("Not");
        }

    }
        }