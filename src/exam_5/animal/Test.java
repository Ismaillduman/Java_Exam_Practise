package exam_5.animal;

import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Animal {
    abstract void jump() throws Exception;
}

class Deer extends Animal {
    void jump() { //Line n1
        System.out.println("DEER JUMPS");
    }

    void jump(int i) {
        System.out.println("DEER JUMPS TO " + i + " FEET");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal animal = new Deer();
        ((Deer)animal).jump(); //Line n2
        ((Deer)animal).jump(5); //Line n3
    }
}