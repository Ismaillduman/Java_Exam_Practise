package oca_2022.q131;

public class q131practice {


}

class Vehicle{
    int x;

    public Vehicle() {
        this(10);
    }

    public Vehicle(int x) {
        this.x = x;
    }
}

class Car extends Vehicle{

    int y;

    Car() {
        this(20);
        //super();

    }
    Car(int y) {
        this.y = y;

    }


    public String toString() {
        return super.x + ":" + this.y;
    }

    public static void main(String[] args) {
        Vehicle y = new Car();
        System.out.println(y);
    }
}