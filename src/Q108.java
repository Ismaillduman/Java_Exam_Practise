package oca_2022.q108;

public class Q108 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            if (arr[i].equals("D")) {//if condtion true ozman workdone yazdirir ve cikar
                System.out.println("Work done");


                break;
            }
            continue;
        }
        StringBuilder sb = new StringBuilder("TOMATO");
        System.out.println(sb.reverse().replace(2, 3,"Tomato")); //Line n1
    }
}
/*
What is the result?
A. A B C Work done
B. A B C D Work done
C. A Work done
D. Compilation fails
Answer: B
 */