import java.util.ArrayList;
import java.util.List;

public class Q_30 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
        names.add("Kevin");

    if (names.remove("Robb" )) {
            names.remove(2 );
        }
        System.out.println(names);
    }
}
