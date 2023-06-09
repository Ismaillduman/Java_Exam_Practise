package exam_5;

public class main {
    static String main = "ONE";
    
    public main() {
        System.out.println("TWO");
    }
    
    public static void main(String [] args) {
        main();
        try {
            try {
                System.out.println(args[1]); //Line n1
            } catch(RuntimeException e) {
                System.out.print("INHALE-"); //Line n2
                throw e; //Line n3
            } finally {
                System.out.print("EXHALE-"); //Line n4
            }
        } catch(RuntimeException e) {
            System.out.print("INHALE-"); //Line n5
        } finally {
            System.out.print("EXHALE"); //Line n6
        }
    }
    
    public static void main() {
        System.out.println(main);
    }
}