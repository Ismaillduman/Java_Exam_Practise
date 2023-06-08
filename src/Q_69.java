public class Q_69 {
    public static void main(String[] args) {
        int[] array = new int[4];
        // array[0]=1;
        array[1] = 1;
        array[2] = 1;
       array[3]=array[0];
        for (int i : array) {
            System.out.println(i);
        }
    }
}