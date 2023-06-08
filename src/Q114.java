import java.time.LocalDate;

public class Q114 {
    public static void main(String[] args) {
        String[][] arr={{"A","B","C","F"},{"D","E"}};
        for (int i=0; i<arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]+" ");
                if(arr[i][j].equals("B")){

                }
                continue;
            }
            break;//

        }


        //System.out.println(LocalDate.of(6, 20, 2014));
        System.out.println("===========================");
        String a="B";
        a=a.concat("C");
        System.out.println(a);
        a=a.replace("C","Vay");
        System.out.println(a);
    }
    /*What is the result?
     A. A B C
     B. A B C D E
     C. A B D E
    D. Compilation fails.
    Answer: C

     */
}