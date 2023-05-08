public class Q_24 {
    static class A{
        public A(){
            System.out.println("A");
        }
    }
    static class B extends A{
        public B(){
            System.out.println("B");
        }
    }
    static class C extends B{
        public C(){
            System.out.println("C");
        }
    }

    public static void main(String[] args) {
        C c = new C();
    }
}
