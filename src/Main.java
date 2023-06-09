class Superclass {
    public void instanceMethod() {
        System.out.println("Superclass - Instance Method");
    }

    public static void staticMethod() {
        System.out.println("Superclass - Static Method");
    }
}

class Subclass extends Superclass {
    // Alt sınıfın örnekleme yöntemi, üst sınıfın örnekleme yöntemini geçersiz kılıyor
    @Override
    public void instanceMethod() {
        System.out.println("Subclass - Instance Method");
    }

    // Alt sınıfın static yöntemi, üst sınıfın örnekleme yöntemini gizleyemez
    public static void staticMethod() {
        System.out.println("Subclass - Static Method");
    }
}

public class Main {
    public static void main(String[] args) {
        Superclass superClass = new Superclass();
        Subclass subClass = new Subclass();

        superClass.instanceMethod(); // Superclass - Instance Method
        superClass.staticMethod(); // Superclass - Static Method

        subClass.instanceMethod(); // Subclass - Instance Method
        subClass.staticMethod(); // Superclass - Static Method (hiding değil)
    }
}
