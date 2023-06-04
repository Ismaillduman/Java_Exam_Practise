package exam3;

import java.util.ArrayList;
import java.util.List;

public class Q_70 {
    public static void main(String[] args) {
        List<String> trafficLight = new ArrayList<>();
        trafficLight.add(1, "RED");
        trafficLight.add(2, "ORANGE");
        trafficLight.add(3, "GREEN");

        trafficLight.remove(new Integer(2));

        System.out.println(trafficLight);
    }
}
