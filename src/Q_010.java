public class Q_010 {
    public static void main(String[] args) {
        int var = 200;
        System.out.print(doCalc(var));
        System.out.print(" " + var);
    }

    public static int doCalc(int var) {
        var = var * 2;
        return var;
    }
}
