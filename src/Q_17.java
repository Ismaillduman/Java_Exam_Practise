public class Q_17 {
    int x, y;

    public Q_17(int x, int y) {
        initialize(x, y);
    }

    public void initialize(int x, int y) {
        this.x = x * x;
        this.y = y * y;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        Q_17 q17 = new Q_17(x, y);
        System.out.println(x+" "+y);
    }
}
