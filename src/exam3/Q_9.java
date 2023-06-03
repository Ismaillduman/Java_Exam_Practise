package exam3;

import java.util.ArrayList;
import java.util.List;

public class Q_9 {
    public static void main(String[] args) {

        int start = 1;
        int sum = 0;
        do {
            if(start % 2 == 0) {
                continue;
            }
            sum += start;
        } while(++start <= 10);
        System.out.println(sum);

        List<StringBuilder> dryFruits = new ArrayList<>();
        dryFruits.add(new StringBuilder("Walnut"));
        dryFruits.add(new StringBuilder("Apricot"));
        dryFruits.add(new StringBuilder("Almond"));
        dryFruits.add(new StringBuilder("Date"));

        for(int i = 0; i < dryFruits.size(); i++)
        {
            if(i == 0) {
                dryFruits.remove(new StringBuilder("Almond"));
            }
        }

        System.out.println(dryFruits);
    }
}
