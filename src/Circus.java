import java.time.LocalDate;

class Animal2 {
    protected void jump() {
        System.out.println("Animal2");
    }
}

class Cat extends Animal2 {
    public void jump() {
        System.out.println("Cat");
    }
}

class Deer extends Animal2 {
    public void jump2() {
        System.out.println("Deer");
    }
}

public class Circus {
    public static void main(String[] args) {
        Animal2 cat = new Cat();
        Animal2 deer = new Deer();
        cat.jump();
        deer.jump();
        LocalDate obj = LocalDate.now();
       // System.out.println(obj.getHour());
    }
}