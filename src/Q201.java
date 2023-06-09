import java.util.Arrays;

class Student3 {
    String name;
    public Student3(String name){
        this.name=name;
    }
}
class number {

    public number(int x,int y){

        int sum=x+y;
    }
}
class Test3{
    public static void main(String[] args){
//        int arr[]=new int[2];
//        arr[0]=1;
//        arr[1]=1;
//        arr=new int[4];
//        arr[2]=30;
//        arr[3]=40;
//        System.out.println(Arrays.toString(arr));

//        System.out.println("================================");
//        Student3 [] Student3s= new Student3[3];;
//        //Student3s[0]=new Student3("A");
//        Student3s[1]=new Student3("Richard");
//        Student3s[2]=new Student3("Donald");
//
//        for( Student3 s:Student3s){
//            System.out.println(" "+s.name);
//        }
//        int[]arr2=new int[3];
//        arr2[1]=1;
//        arr2[2]=1;
//        for (int i : arr2) {
//            System.out.println(i);
//        }

        StringBuilder s= new StringBuilder("hi");
       // s.append(" "+s);
        System.out.println(s);
        String x= "hi";
        //x.concat(x);
        System.out.println(x);
        System.out.println(s.toString().equals(x));
        System.out.println(s.toString()==x);
     }

//second way
//
//        Student3 [] Student3s= new Student3[3];
//        Student3s[1]=;hfder

















//        Student3s[2]=new Student3("Donald");
//        for( Student3 s:Student3s){
//            System.out.println(" "+s.name);
//        }
//    }
}

// What is the result?
/*
*A. nullRichardDonald
B. RichardDonald
C. Compilation fails
D. An ArrayOutOfBoundException is thrown at runtime
E. A NullPointerException is thrown at runtime.
*/

