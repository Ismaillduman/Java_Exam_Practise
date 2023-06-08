package com.udayankhattry.oca;
 
import java.io.FileNotFoundException;
 
public class Test {
    static String [] names = {"Williamson.pdf", "Finch.pdf", "Kohli.pdf", "Morgan.pdf"};
    public static void main(String[] args) {

        int i = 1;
        int j = 5;
        int k = 0;
        A: while(true) {
            i++;
            B: while(true) {
                j--;
                C: while(true) {
                    k += i + j;
                    if(i == j)
                        break A;
                    else if (i > j)
                        continue A;
                    else
                        continue B;
                }
            }
        }
        System.out.println(k);
        try {
            if (search("virat.pdf"))
                System.out.println("FOUND");
 
        } catch(FileNotFoundException ex) {
            System.out.println("NOT FOUND");
        }

    }
 
    private static boolean search(String name) throws FileNotFoundException {
        for(int i = 0; i < 4; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return true;
            }
        }
        throw new FileNotFoundException();

    }
}