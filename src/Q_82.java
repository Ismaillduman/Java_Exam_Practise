

public class Q_82 {

}
class Alpha{

    int ns; //50
    static int s; // 50, 125

    Alpha(int ns){
        if(s<ns){
            s = ns;
            this.ns = ns;
        }
    }
    void doPrint(){
        System.out.println("ns = "+ns+" s = "+s);
    }
}
 class TestA{
    public static void main(String[] args) {
        Alpha ref1 = new Alpha(50);

        Alpha ref2 = new Alpha(125);
        ref2.doPrint();
        Alpha ref3 = new Alpha(100);

int [] array= new int[5];
int [] array2= new int[]{1,5,4,78,6,8};
       array[0]=5;

       int[] arr={1,2,3,4,56};



        ref3.doPrint();
        ref1.doPrint();
    }

}
//What is the result?
//A
//            ns = 50   s = 125
//            ns = 125  s = 125
//            ns = 100  s = 125

//B
//            ns = 50  s = 125
//            ns = 125  s = 125
//            ns = 0  s = 125

//C
//            ns = 50  s = 50
//            ns = 125  s = 125
//            ns = 100  s = 100

//D
//            ns = 50  s = 50
//            ns = 125  s = 125
//            ns = 100  s = 125

//A.	Option A
//B.	Option B
//C.	Option C
//D.	Option D
//Answer: B

//second version

//class Alpha{
//
//   static int ns;
//    int s;
//
//    Alpha(int ns){
//        if(s<ns){
//            s = ns;
//            this.ns = ns;
//        }
//    }
//    void doPrint(){
//        System.out.println("ns = "+ns+" s = "+s);
//    }
//}
//class TestA{
//    public static void main(String[] args) {
//        Alpha ref1 = new Alpha(50);
//        Alpha ref2 = new Alpha(100);
//        Alpha ref3 = new Alpha(125);
//
//        ref1.doPrint();
//        ref2.doPrint();
//        ref3.doPrint();
//    }
//
//}
