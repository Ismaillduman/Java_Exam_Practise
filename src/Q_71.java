public class Q_71 {
    public static void main(String[] args) {
        C2 obj1 = new C1();
        I obj2 = new C1();

        C2 s = (C2) obj2; // Geçerli, obj2'yi C2'ye dönüştürüyoruz
        I t = obj1; // Geçerli, obj1'i I arayüzüne atıyoruz

        t.displayI();
        s.displayC2();
    }
}
interface I {
    public void displayI();
}

class C2 implements I {
    public void displayC2() {
        System.out.println("C2");
    }

    @Override
    public void displayI() {
        System.out.println("C2 implementing I");
    }
}

class C1 extends C2 {
    @Override
    public void displayI() {
        System.out.println("C1 implementing I");
    }
}


