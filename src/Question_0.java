public class Question_0 {
    public static void sum(Integer x, Integer y) {
        System.out.println("Integer " + (x + y));
    }

    public static void sum(int x, int y) {
        System.out.println("int " + (x + y));
    }

    public static void sum(double x, double y) {
        System.out.println("Double " + (x + y));
    }

    public static void sum(float x, float y) {
        System.out.println("Float " + (x + y));
    }

    public static void main(String[] args) {
        sum(10, 20);
        sum(10.0, 20.0);
    }
}
